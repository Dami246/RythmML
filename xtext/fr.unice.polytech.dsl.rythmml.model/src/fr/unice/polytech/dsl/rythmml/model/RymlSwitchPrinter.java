package fr.unice.polytech.dsl.rythmml.model;

import java.text.MessageFormat;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.BarMultiplier;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.ClassicalBar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.ModifiedBar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NoteAddition;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NoteDeletion;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NoteReplacement;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Operation;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Section;
import fr.unice.polytech.dsl.rythmml.model.rythmml.util.RythmmlSwitch;

public class RymlSwitchPrinter extends RythmmlSwitch<String>{

	@Override
	public String caseMusic(Music music) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(RymlUtils.mainBegin());
		stringBuilder.append("ConcreteMIDIVisitor midiVisitor = new ConcreteMIDIVisitor(); \n\n");
		
		for(Note n : music.getOwnedNotes()) //Declare all notes
			stringBuilder.append(this.caseNote(n));
		
		for(Beat b : music.getOwnedBeats()) //Declare all beats
			stringBuilder.append(this.caseBeat(b));
		
		for(Bar b : music.getOwnedBars()) //Declare all bar
			stringBuilder.append(this.caseBar(b));
		
		for(Pattern pattern : music.getOwnedPatterns()) //Declare all pattern
			stringBuilder.append(this.casePattern(pattern));
		
		for(Section s : music.getOwnedSections())
			stringBuilder.append(this.caseSection(s));
		
		stringBuilder.append(String.format("Music %s = new MusicBuilder()", music.getName()));
		stringBuilder.append(String.format(".setAuthor(\"%s\").setTitle(\"%s\")", music.getAuthor(), music.getTitle()));
		
		for(Section s : music.getOwnedSections()) {
			stringBuilder.append(String.format(".addSection(%s)", s.getName()));
		}
		
		stringBuilder.append(".prepare().build(); \n");
		
		stringBuilder.append(String.format("\nMIDIPlayer.createSequence(%d);\n" + 
				"MIDIPlayer.setTempoBPM(%d);\n" + 
				"%s.accept(midiVisitor);\n" + 
				"MIDIPlayer.playSequence();\n", 
				music.getResolutionPerSlide(), music.getBpm(), music.getName()));
		
		stringBuilder.append(RymlUtils.mainEnd());
		return stringBuilder.toString();
	}

	@Override
	public String caseSection(Section section) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("Section %s = new SectionBuilder()", section.getName()));
		for(Pattern p : section.getPatterns())
			stringBuilder.append(String.format(".addPattern(%s)", p.getName()));
		
		stringBuilder.append(".build(); \n");
		return stringBuilder.toString();
	}

	@Override
	public String casePattern(Pattern pattern) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("Pattern %s = new PatternBuilder()", pattern.getName()));
		
		for(BarMultiplier b : pattern.getBars()) {
			stringBuilder.append(String.format(".addRepeatedBar(%s, %d)", b.getBar().getName(), b.getMultiplier()));
		}
		
		stringBuilder.append(".build(); \n");
		return stringBuilder.toString();
	}

	@Override
	public String caseBar(Bar bar) {
		if(bar instanceof ClassicalBar) return caseClassicalBar((ClassicalBar)bar);
		else return caseModifiedBar((ModifiedBar)bar);
	}
	
	@Override
	public String caseClassicalBar(ClassicalBar bar) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("Bar %s = new BarBuilder()", bar.getName()));
		
		for(Beat beat : bar.getBeats()) {
			stringBuilder.append(String.format(".addBeat(%s)", beat.getName()));
		}
		stringBuilder.append(".build(); \n");
		return stringBuilder.toString();
	}
	
	@Override
	public String caseModifiedBar(ModifiedBar bar) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("Bar %s = new BarVariationBuilder(%s)", bar.getName(), bar.getBar().getName()));
		for (Operation operation : bar.getOperations()) {
			stringBuilder.append(caseOperation(operation));
		}
		stringBuilder.append(".build(); \n");
		return stringBuilder.toString();
	}
	
	

	@Override
	public String caseOperation(Operation object) {
		if(object instanceof NoteDeletion) return caseNoteDeletion(((NoteDeletion) object));
		else return "";
	}

	@Override
	public String caseNoteAddition(NoteAddition object) {
		return String.format(".addNote(%s)",object.getNote().getName());
	}

	@Override
	public String caseNoteDeletion(NoteDeletion object) {
		return String.format(".removeNote(%s)",object.getNote().getName());
	}

	@Override
	public String caseNoteReplacement(NoteReplacement object) {
		return String.format(".replaceNote(%s,%s)",object.getNoteSrc().getName(), object.getNewNote().getName());
	}

	@Override
	public String caseBeat(Beat beat) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("Beat %s = new BeatBuilder()", beat.getName()));
		for(int i = 0; i< beat.getNotes().size(); ++i)
			stringBuilder.append(String.format(".addNote(%s,%d)"
					, beat.getNotes().get(i).getName(), beat.getNotePositions().get(i)));
		
		stringBuilder.append(String.format(".setNbDivision(%d).build(); \n", ((Music)beat.eContainer()).getResolutionPerSlide()));
		return stringBuilder.toString();
	}

	@Override
	public String caseNote(Note note) {
		return String.format("Note %s = new NoteBuilder().setNoteValue(DrumNoteValue.%s).build(); \n",
				note.getName(), note.getValue());
	}

	@Override
	public String defaultCase(EObject object) {
		System.out.println("DefaultCase");
		return "";
	}
	
	

}

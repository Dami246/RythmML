package fr.unice.polytech.dsl.rythmml.model;

import java.text.MessageFormat;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Section;
import fr.unice.polytech.dsl.rythmml.model.rythmml.util.RythmmlSwitch;

public class RymlSwitchPrinter extends RythmmlSwitch<String>{

	@Override
	protected String doSwitch(int classifierID, EObject theEObject) {
		// TODO Auto-generated method stub
		return super.doSwitch(classifierID, theEObject);
	}

	@Override
	public String caseMusic(Music music) {
		StringBuilder stringBuilder = new StringBuilder();
		for(Note n : music.getNote()) //Declare all notes
			stringBuilder.append(this.caseNote(n));
		
		for(Beat b : music.getBeat()) //Declare all beats
			stringBuilder.append(this.caseBeat(b));
		
		for(Section s : music.getSection())
			stringBuilder.append(this.caseSection(s));
		
		stringBuilder.append(String.format("Music %s = new MusicBuilder()", music.getName()));
		stringBuilder.append(String.format(".setAuthor(\"%s\").setTitle(\"%s\")", music.getAuthor(), music.getTitle()));
		//stringBuilder.append(String.format(".addSection(section1)");
		
		stringBuilder.append(".prepare().build(); \n");
		return stringBuilder.toString();
	}

	@Override
	public String caseSection(Section section) {
		StringBuilder stringBuilder = new StringBuilder();
		for(Pattern p : section.getPattern())
			stringBuilder.append(this.casePattern(p));
		return stringBuilder.toString();
	}

	@Override
	public String casePattern(Pattern pattern) {
		StringBuilder stringBuilder = new StringBuilder();
		for(Bar b : pattern.getBar())
			stringBuilder.append(this.caseBar(b));
		return stringBuilder.toString();
	}

	@Override
	public String caseBar(Bar bar) {
		StringBuilder stringBuilder = new StringBuilder();
		for(Beat b : bar.getBeat())
			stringBuilder.append(this.caseBeat(b));
		return stringBuilder.toString();
	}

	@Override
	public String caseBeat(Beat beat) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("Beat %s = new BeatBuilder()", beat.getName()));
		for(int i = 0; i< beat.getNote().size(); ++i)
			stringBuilder.append(String.format(".addNote(%s,%d)"
					, beat.getNote().get(i).getName(), beat.getNotePositions().get(i)));
		
		stringBuilder.append(".build(); \n");
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

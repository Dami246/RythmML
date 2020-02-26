package fr.polytech.rythmml;

import fr.polytech.rythmml.Utils.PrettyPrinter;
import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.bar.BarBuilder;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.beat.BeatBuilder;
import fr.polytech.rythmml.midi.ConcreteMIDIVisitor;
import fr.polytech.rythmml.midi.MIDIPlayer;
import fr.polytech.rythmml.music.Music;
import fr.polytech.rythmml.music.MusicBuilder;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.note.NoteBuilder;
import fr.polytech.rythmml.note.notevalue.DrumNoteValue;
import fr.polytech.rythmml.pattern.Pattern;
import fr.polytech.rythmml.pattern.PatternBuilder;
import fr.polytech.rythmml.section.Section;
import fr.polytech.rythmml.section.SectionBuilder;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // testing models
        String title = "Billie Jean";
        String author = "Walidou";
        ConcreteMIDIVisitor midiVisitor = new ConcreteMIDIVisitor();

        Note S = new NoteBuilder().setNoteValue(DrumNoteValue.SD).setDuration(10)
                .build();

        Note bd = new NoteBuilder().setNoteValue(DrumNoteValue.BD).setDuration(100)
                .build();

        Note xH = new NoteBuilder().setNoteValue(DrumNoteValue.CH).setDuration(2)
                .build();

        Beat beat1 = new BeatBuilder()
                .addNote(xH,0).addNote(xH, 1).addNote(xH, 2).addNote(xH,3)
                .addNote(S, 2)
                .addNote(bd, 0)
                .setNbOfTicks(200).setNbDivision(4).build();

        Bar bar1 = new BarBuilder().addBeat(beat1).addBeat(beat1).build();

        Pattern pattern1 = new PatternBuilder().addRepeatedBar(bar1, 20)
                .build();

        Section section1 = new SectionBuilder().addPattern(pattern1).build();

        Music music = new MusicBuilder().setAuthor(author).setTitle(title).addSection(section1).prepare().build();


        System.out.println(PrettyPrinter.prettyPrintPattern(pattern1));

        MIDIPlayer.createSequence(200); //in slice per beat
        MIDIPlayer.setTempoBPM(60);
        music.accept(midiVisitor);
        MIDIPlayer.playSequence();

    }
}

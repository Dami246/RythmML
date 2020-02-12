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

        Note N1 = new NoteBuilder().setNoteValue(DrumNoteValue.S).setDuration(2)
                .build();


        Note N2 = new NoteBuilder().setNoteValue(DrumNoteValue.TO).setDuration(10)
                .build();

        Note N3 = new NoteBuilder().setNoteValue(DrumNoteValue.WS).setDuration(15)
                .build();

        Note N4 = new NoteBuilder().setNoteValue(DrumNoteValue.CC).setDuration(2)
                .build();


        Beat beat1 = new BeatBuilder().addNote(N1).addNote(N2).addNote(N4).setNbOfTicks(10).build();
        Beat beat2 = new BeatBuilder().addNote(N2).addNote(N3).addNote(N2).setNbOfTicks(10).build();

        Bar bar1 = new BarBuilder().addBeat(beat1).addBeat(beat2).addBeat(beat2).addBeat(beat1).build();
        Bar bar2 = new BarBuilder().addBeat(beat2).addBeat(beat2).build();


        Pattern pattern1 = new PatternBuilder().addRepeatedBar(bar1, 50).addRepeatedBar(bar2, 48).build();

        Section section1 = new SectionBuilder().addPattern(pattern1).build();

        Music music = new MusicBuilder().setAuthor(author).setTitle(title).addSection(section1).build();


        System.out.println(PrettyPrinter.PrettyPrintBar(bar1));
        System.out.println(music);

        MIDIPlayer.createSequence(200);
        MIDIPlayer.setTempoBPM(10);
        music.accept(midiVisitor);
        MIDIPlayer.playSequence();

    }
}

package fr.polytech.rythmml;

import fr.polytech.rythmml.Utils.PrettyPrinter;
import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.bar.BarBuilder;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.beat.BeatBuilder;
import fr.polytech.rythmml.music.Music;
import fr.polytech.rythmml.music.MusicBuilder;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.note.NoteBuilder;
import fr.polytech.rythmml.note.PositionInTime;
import fr.polytech.rythmml.note.notevalue.DrumNoteValue;
import fr.polytech.rythmml.pattern.Pattern;
import fr.polytech.rythmml.pattern.PatternBuilder;
import fr.polytech.rythmml.section.Section;
import fr.polytech.rythmml.section.SectionBuilder;

public class Main {


    public static void main(String[] args) {
        // testing models
        String title = "Billie Jean";
        String author = "Walidou";

        Note N1 = new NoteBuilder().setNoteValue(DrumNoteValue.BD).setDuration(2)
                .setPositionInTime(new PositionInTime())
                .build();


        Note N2 = new NoteBuilder().setNoteValue(DrumNoteValue.CC).setDuration(10)
                .setPositionInTime(new PositionInTime())
                .build();

        Note N3 = new NoteBuilder().setNoteValue(DrumNoteValue.OH).setDuration(15)
                .setPositionInTime(new PositionInTime())
                .build();


        Beat beat1 = new BeatBuilder().addNote(N1).addNote(N2).setNbOfTicks(10).build();
        Beat beat2 = new BeatBuilder().addNote(N2).addNote(N3).addNote(N2).setNbOfTicks(10).build();

        Bar bar1 = new BarBuilder().addBeat(beat1).addBeat(beat2).addBeat(beat2).addBeat(beat1).build();
        Bar bar2 = new BarBuilder().addBeat(beat2).addBeat(beat2).build();


        Pattern pattern1 = new PatternBuilder().addRepeatedBar(bar1, 50).addRepeatedBar(bar2, 48).build();

        Section section1 = new SectionBuilder().addPattern(pattern1).build();

        Music music = new MusicBuilder().setAuthor(author).setTitle(title).setSection(section1).build();


        System.out.println(PrettyPrinter.PrettyPrintBar(bar1));
        System.out.println(music);

    }

}

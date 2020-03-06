package fr.polytech.rythmml;

import fr.polytech.rythmml.Utils.PrettyPrinter;
import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.bar.BarBuilder;
import fr.polytech.rythmml.bar.BarVariationBuilder;
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

/**
 * Billie Jean : Mickael Jackson
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // testing models
        String title = "Billie Jean";
        String author = "Walidou";
        ConcreteMIDIVisitor midiVisitor = new ConcreteMIDIVisitor();

        Note SD = new NoteBuilder().setNoteValue(DrumNoteValue.SD)
                .build();

        Note BD = new NoteBuilder().setNoteValue(DrumNoteValue.BD)
                .build();

        Note CH = new NoteBuilder().setNoteValue(DrumNoteValue.CH)
                .build();

        Beat beat1 = new BeatBuilder()
                .addNote(CH, 0)
                .addNote(BD, 0)
                .setNbDivision(4).build();

        Beat beat2 = new BeatBuilder()
                .addNote(CH, 0)
                .setNbDivision(4).build();

        Beat beat3 = new BeatBuilder()
                .addNote(CH, 0)
                .addNote(SD, 0)
                .setNbDivision(4).build();

        Beat beat4 = new BeatBuilder()
                .addNote(CH, 0)
                .setNbDivision(4).build();

        Bar bar1 = new BarBuilder().addBeat(beat1).addBeat(beat2).addBeat(beat3).addBeat(beat4).build();
        Bar barVaried = new BarVariationBuilder(bar1).replaceNote(BD, CH).build();
        Bar barVaried2 = new BarVariationBuilder(bar1).removeNote(BD).build();
        Bar barVaried3 = new BarVariationBuilder(bar1).replaceNoteInSpecificBeat(3, CH, SD).build();
        Bar barVaried4 = new BarVariationBuilder(bar1).removeNoteInSpecificBeat(3, CH).build();
        Bar barVaried5 = new BarVariationBuilder(bar1).addNoteInSpecificBeat(2, CH, 0).build();

        System.out.println(PrettyPrinter.prettyPrintBar(bar1));
        System.out.println(PrettyPrinter.prettyPrintBar(barVaried));
        System.out.println(PrettyPrinter.prettyPrintBar(barVaried2));
        System.out.println(PrettyPrinter.prettyPrintBar(barVaried3));
        System.out.println(PrettyPrinter.prettyPrintBar(barVaried4));
        System.out.println(PrettyPrinter.prettyPrintBar(barVaried5));


        System.out.println("-----");
        Bar barMixed = new BarVariationBuilder(bar1).replaceNote(BD, CH).removeNote(BD).build();
        System.out.println(PrettyPrinter.prettyPrintBar(barMixed));
        System.out.println("-----");


        Pattern pattern1 = new PatternBuilder().addRepeatedBar(bar1, 4).addRepeatedBar(barVaried, 4).addRepeatedBar(barVaried2, 4).addRepeatedBar(barVaried3, 4)
                .addRepeatedBar(barVaried4, 4).addRepeatedBar(barVaried5, 4)
                .build();

        System.out.println(PrettyPrinter.prettyPrintPattern(pattern1));

        Section section1 = new SectionBuilder().addPattern(pattern1).build();

        Music music = new MusicBuilder().setAuthor(author).setTitle(title).addSection(section1).prepare().build();


        MIDIPlayer.createSequence(200); //in slice per beat
        MIDIPlayer.setTempoBPM(230);
        music.accept(midiVisitor);
        MIDIPlayer.playSequence();
    }
}

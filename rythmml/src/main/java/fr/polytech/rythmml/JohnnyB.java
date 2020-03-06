package fr.polytech.rythmml;

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

/**
 * Johnny B music
 */
public class JohnnyB {
    public static void main(String[] args) {
        ConcreteMIDIVisitor midiVisitor = new ConcreteMIDIVisitor();

        Note s = new NoteBuilder().setNoteValue(DrumNoteValue.S).build();
        Note bd = new NoteBuilder().setNoteValue(DrumNoteValue.BD).build();
        Note rc = new NoteBuilder().setNoteValue(DrumNoteValue.RC).build();
        Beat beat1 = new BeatBuilder().addNote(rc,1).addNote(bd,0).setNbDivision(200).build();
        Beat beat2 = new BeatBuilder().addNote(rc,0).setNbDivision(200).build();
        Beat beat3 = new BeatBuilder().addNote(rc,1).addNote(s,0).setNbDivision(200).build();
        Beat beat4 = new BeatBuilder().addNote(rc,0).setNbDivision(200).build();
        Bar bar = new BarBuilder().addBeat(beat1).addBeat(beat2).addBeat(beat3).addBeat(beat4).build();
        Pattern fp = new PatternBuilder().addRepeatedBar(bar, 64).build();
        Section first_section_1 = new SectionBuilder().addPattern(fp).build();
        Music amusic = new MusicBuilder().setAuthor("Chuck Berry").setTitle("Johnny B").addSection(first_section_1).prepare().build();

        MIDIPlayer.createSequence(200);
        MIDIPlayer.setTempoBPM(250);
        amusic.accept(midiVisitor);
        MIDIPlayer.playSequence();
    }
}

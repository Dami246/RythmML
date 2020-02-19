package fr.polytech.rythmml.midi;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.music.Music;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.pattern.Pattern;
import fr.polytech.rythmml.section.Section;

import static fr.polytech.rythmml.midi.MIDIPlayer.createEvent;

public class ConcreteMIDIVisitor implements MIDIVisitor {

    @Override
    public void visit(Music music) {
        for(Section s: music.getSections()){
            s.accept(this);
        }
    }

    @Override
    public void visit(Section section) {
        for (Pattern p : section.getPatternList()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(Pattern pattern) {
        for (Bar bar : pattern.getBarList()) {
                bar.accept(this);
        }
    }

    @Override
    public void visit(Bar bar) {
        for (Beat beat: bar.getListOfBeats()) {
            beat.accept(this);
        }
    }

    @Override
    public void visit(Beat beat) {
        for(Note note: beat.getListOfNotes()) {
            note.accept(this);
        }
    }

    @Override
    public void visit(Note note) {
        final int NOTEON = 144;
        final int NOTEOFF = 128;

        createEvent(NOTEON,  note, note.getTickNb());
        createEvent(NOTEOFF, note, note.getTickNb() + note.getDuration());

    }
}

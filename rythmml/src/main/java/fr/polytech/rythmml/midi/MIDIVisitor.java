package fr.polytech.rythmml.midi;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.music.Music;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.pattern.Pattern;
import fr.polytech.rythmml.section.Section;

public interface MIDIVisitor {
    void visit(Music music);
    void visit(Section section);
    void visit(Pattern pattern);
    void visit(Bar bar);
    void visit(Beat beat);
    void visit(Note note);
}

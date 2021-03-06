package fr.polytech.rythmml.section;

import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.pattern.Pattern;

import java.util.List;

public class Section implements MIDIVisitable, Cloneable {

    private List<Pattern> patternList;

    public Section(List<Pattern> patterns) {
        this.patternList = patterns;
    }

    public List<Pattern> getPatternList() {
        return patternList;
    }

    public Pattern getPatterByIndex(int i) {
        try {
            return this.patternList.get(i);
        }
        catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public Object clone() throws CloneNotSupportedException{
        return (Section)super.clone();
    }

    @Override
    public String toString() {
        return "Section{" +
                "patternList=" + patternList +
                '}';
    }

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}

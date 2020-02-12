package fr.polytech.rythmml.section;

import fr.polytech.rythmml.midi.MIDIPlayable;
import fr.polytech.rythmml.pattern.Pattern;

import java.util.List;

public class Section implements MIDIPlayable {

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

    @Override
    public String toString() {
        return "Section{" +
                "patternList=" + patternList +
                '}';
    }

    @Override
    public void play() {
        for (Pattern p: patternList) {
            p.play();
        }
    }
}

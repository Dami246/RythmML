package fr.polytech.rythmml.pattern;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;

import java.util.List;

public class Pattern implements MIDIVisitable {
    List<Bar> barList;

    public Pattern(List<Bar> barList) {
        this.barList = barList;
    }

    public List<Bar> getBarList() {
        return barList;
    }

    public Bar getBarByIndex(int i) {
        try {
            return this.barList.get(i);
        }
        catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Pattern{" +
                "barList=" + barList +
                '}';
    }

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}

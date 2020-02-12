package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;

import java.util.ArrayList;
import java.util.List;

public class Bar implements MIDIVisitable {
    List<Beat> listOfBeats;

    public Bar(List<Beat> listOfBeats){
        this.listOfBeats = new ArrayList<>(listOfBeats);
    }

    public List<Beat> getListOfBeats() {
        return listOfBeats;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "listOfBeats=" + listOfBeats +
                '}';
    }

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}

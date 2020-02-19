package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class Bar implements MIDIVisitable, Cloneable {
    List<Beat> listOfBeats;

    public Object clone() throws CloneNotSupportedException{
        Bar newB = (Bar)super.clone();
        newB.listOfBeats = new ArrayList<Beat>();
        for (Beat b : listOfBeats) {
            newB.listOfBeats.add((Beat)b.clone());
        }
        return newB;
    }

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

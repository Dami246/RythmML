package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.midi.MIDIPlayable;

import java.util.ArrayList;
import java.util.List;

public class Bar implements MIDIPlayable {
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
    public void play() {
        for (Beat beat: listOfBeats) {
            beat.play();
        }
    }
}

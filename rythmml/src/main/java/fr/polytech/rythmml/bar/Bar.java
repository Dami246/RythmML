package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.beat.Beat;

import java.util.ArrayList;
import java.util.List;

public class Bar {
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
}

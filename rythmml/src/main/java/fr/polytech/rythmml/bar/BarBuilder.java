package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.beat.Beat;

import java.util.ArrayList;
import java.util.List;

public class BarBuilder {
    List<Beat> listOfBeats;

    public BarBuilder() {
        listOfBeats = new ArrayList<>();
    }

    public Bar build() {
        return new Bar(listOfBeats);
    }

    public BarBuilder setListOfBeats(List<Beat> listOfBeats) {
        this.listOfBeats = listOfBeats;
        return this;
    }

    public BarBuilder addBeat(Beat beat) {
        this.listOfBeats.add(beat);
        return this;
    }
}


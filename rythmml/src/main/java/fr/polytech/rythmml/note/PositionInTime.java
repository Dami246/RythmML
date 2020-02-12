package fr.polytech.rythmml.note;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.beat.Beat;

public class PositionInTime {

    // A position in time is hence defined by a (bar,beat,tick)
    Bar bar;
    Beat beat;
    int tick;

    public PositionInTime(Bar bar, Beat beat, int tick){
        this.bar = bar;
        this.beat = beat;
        this.tick = tick;
    }

    public Bar getBar() {
        return bar;
    }

    public Beat getBeat() {
        return beat;
    }

    public int getTick() {
        return tick;
    }

    @Override
    public String toString() {
        return "PositionInTime{" +
                "bar=" + bar +
                ", beat=" + beat +
                ", tick=" + tick +
                '}';
    }
}

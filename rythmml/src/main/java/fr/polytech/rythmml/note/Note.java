package fr.polytech.rythmml.note;

import fr.polytech.rythmml.midi.MIDIPlayer;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.notevalue.DrumNoteValue;
import fr.polytech.rythmml.note.notevalue.NoteValue;

import java.util.Objects;

import static fr.polytech.rythmml.midi.MIDIPlayer.createEvent;

public class Note implements MIDIVisitable, Cloneable {

    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    private NoteValue noteValue;

    // number of ticks of duration
    private int duration;

    // position in time
    private int tickNb;

    public int getDivision() {
        return division;
    }

    // position in division
    private int division;

    Note(NoteValue noteValue, int duration) {
        this.noteValue = noteValue;
        this.duration = duration;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public NoteValue getNoteValue() {
        return noteValue;
    }

    public int getNoteNumber() {
        return noteValue.getNoteNumber();
    }

    public int getDuration() {
        return duration;
    }

    public int getVelocity() {
        return 90; //TODO : TEMP
    }


    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }

    public void setTickNb(int tickNb) {
        this.tickNb = tickNb;
    }

    public void setDivision(int division) {
        this.division = division;
    }


    public int getTickNb() {
        return tickNb;
    }

}

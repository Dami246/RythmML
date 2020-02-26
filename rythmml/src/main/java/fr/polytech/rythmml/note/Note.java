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

    public Note(NoteValue noteValue, int duration){
        this.noteValue = noteValue;
        this.duration = duration;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return ((Note)super.clone());
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

//    @Override
//    public String toString() {
//        return "Note{" +
//                "noteValue=" + noteValue +
//                ", duration=" + duration +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return duration == note.duration &&
                tickNb == note.tickNb &&
                noteValue.equals(note.noteValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteValue, duration, tickNb);
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
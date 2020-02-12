package fr.polytech.rythmml.note;

import fr.polytech.rythmml.midi.MIDIPlayer;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.notevalue.DrumNoteValue;
import fr.polytech.rythmml.note.notevalue.NoteValue;

public class Note implements MIDIVisitable {
    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    private NoteValue noteValue;

    // number of ticks
    private int duration;

    // position in time
    private PositionInTime positionInTime;

    Note(NoteValue noteValue, int duration, PositionInTime positionInTime){
        this.noteValue = noteValue;
        this.duration = duration;
        this.positionInTime = positionInTime;
    }

    public NoteValue getNoteValue() {
        return noteValue;
    }
    public int getNoteNumber(){
        return noteValue.getNoteNumber();
    }

    public int getDuration() {
        return duration;
    }

    public PositionInTime getPositionInTime() {
        return positionInTime;
    }

    public int getVelocity() {
        return 90; //TODO : TEMP
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteValue=" + noteValue +
                ", duration=" + duration +
                ", positionInTime=" + positionInTime +
                '}';
    }

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}

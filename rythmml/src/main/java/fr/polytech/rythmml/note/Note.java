package fr.polytech.rythmml.note;

import fr.polytech.rythmml.note.notevalue.NoteValue;

public class Note {
    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    // number of ticks
    int duration;

    // position in time
    PositionInTime positionInTime;

    Note(NoteValue noteValue, int duration, PositionInTime positionInTime){
        this.noteValue = noteValue;
        this.duration = duration;
        this.positionInTime = positionInTime;
    }

    public NoteValue getNoteValue() {
        return noteValue;
    }

    public int getDuration() {
        return duration;
    }

    public PositionInTime getPositionInTime() {
        return positionInTime;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteValue=" + noteValue +
                ", duration=" + duration +
                ", positionInTime=" + positionInTime +
                '}';
    }
}

package fr.polytech.rythmml.note;

import fr.polytech.rythmml.note.notevalue.NoteValue;

public class NoteBuilder {
    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    // number of ticks
    int duration;

    // position in time
    PositionInTime positionInTime;

    public NoteBuilder(){

    }

    public Note build() {
        return new Note(noteValue,duration);
    }

    public NoteBuilder setNoteValue(NoteValue noteValue) {
        this.noteValue = noteValue;
        return this;
    }

    public NoteBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public NoteBuilder setPositionInTime(PositionInTime positionInTime) {
        this.positionInTime = positionInTime;
        return this;
    }
}


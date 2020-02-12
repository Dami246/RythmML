package fr.polytech.rythmml.note.notevalue;

public enum DrumNoteValue implements NoteValue {
    BD(36), SD(0), CH(42), OH(46), CC(0), RC(0);
    //TODO : Change 0

    int noteNumber;

    DrumNoteValue(int noteNumber){
        this.noteNumber = noteNumber;
    }

    @Override
    public int getNoteNumber() {
        return noteNumber;
    }
}



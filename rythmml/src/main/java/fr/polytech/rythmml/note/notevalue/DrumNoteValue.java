package fr.polytech.rythmml.note.notevalue;

public enum DrumNoteValue implements NoteValue {
    BD(36), SD(38), CH(42), OH(46), CC(49), RC(51),
    TM(80), TO(81), S(40), WS(71), L(27);

    int noteNumber;

    DrumNoteValue(int noteNumber){
        this.noteNumber = noteNumber;
    }

    @Override
    public int getNoteNumber() {
        return noteNumber;
    }
}
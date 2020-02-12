package fr.polytech.rythmml.note.notevalue;

public enum DrumNoteValue implements NoteValue {
<<<<<<< HEAD
    BD(36), SD(0), CH(42), OH(46), CC(0), RC(0);
=======
    BD(36), SD(38), CH(42), OH(46), CC(49), RC(51),
    TM(80), TO(81), S(82), WS(71);
>>>>>>> master
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



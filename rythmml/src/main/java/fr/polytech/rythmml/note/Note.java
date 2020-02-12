package fr.polytech.rythmml.note;

import fr.polytech.rythmml.midi.MIDIPlayable;
import fr.polytech.rythmml.midi.MIDIPlayer;
import fr.polytech.rythmml.note.notevalue.DrumNoteValue;
import fr.polytech.rythmml.note.notevalue.NoteValue;

import static fr.polytech.rythmml.midi.MIDIPlayer.createEvent;

public class Note implements MIDIPlayable, Cloneable {
    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    private NoteValue noteValue;

    // number of ticks of duration
    private int duration;

    // position in time
    private int tickNb;

    Note(NoteValue noteValue, int duration){
        this.noteValue = noteValue;
        this.duration = duration;
    }

    public Object clone() throws CloneNotSupportedException{
        return (Note)super.clone();
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


    public void play() {
        final int NOTEON = 144;
        final int NOTEOFF = 128;

        createEvent(NOTEON,  this, tickNb);
        createEvent(NOTEOFF, this, tickNb + duration);
    }

    public int getVelocity() {
        return 90; //TODO : TEMP
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteValue=" + noteValue +
                ", duration=" + duration +
                '}';
    }

    public static void main(String[] args) {
        Note N1 = new NoteBuilder().setNoteValue(DrumNoteValue.BD).setDuration(2)
                .build();

        Note N2 = new NoteBuilder().setNoteValue(DrumNoteValue.CH).setDuration(2)
                .build();

        Note N3 = new NoteBuilder().setNoteValue(DrumNoteValue.OH).setDuration(2)
                .build();

        MIDIPlayer.createSequence(200);
        MIDIPlayer.setTempoBPM(5);
        N1.play();
        N2.play();
        N2.play();
        N2.play();
        N2.play();
        N2.play();
        N2.play();
        N3.play();
        N3.play();
        N3.play();
        N3.play();
        N3.play();
        N3.play();


        MIDIPlayer.playSequence();

    }

    public void setTickNb(int tickNb) {
        this.tickNb = tickNb;
    }
}

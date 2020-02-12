package fr.polytech.rythmml.note;

import fr.polytech.rythmml.midi.MIDIPlayer;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.notevalue.DrumNoteValue;
import fr.polytech.rythmml.note.notevalue.NoteValue;
import static fr.polytech.rythmml.midi.MIDIPlayer.createEvent;

public class Note implements MIDIVisitable, Cloneable {

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

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}

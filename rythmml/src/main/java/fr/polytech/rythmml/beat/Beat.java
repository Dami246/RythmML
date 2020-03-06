package fr.polytech.rythmml.beat;

import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class Beat implements MIDIVisitable, Cloneable {
    int nbOfTicks;
    List<Note> listOfNotes;
    int nbdivision;

    public Beat(int nbOfTicks, int nbdivision, List<Note> listOfNotes) {
        this.nbOfTicks = nbOfTicks;
        this.nbdivision = nbdivision;
        this.listOfNotes = new ArrayList<>(listOfNotes);
    }

    public Object clone() throws CloneNotSupportedException{
        Beat newBeat = (Beat)super.clone();
        newBeat.listOfNotes = new ArrayList<>();
        for (Note n : listOfNotes) {
            newBeat.listOfNotes.add((Note)n.clone());
        }
        return newBeat;
    }

    public int getNbOfTicks() {
        return nbOfTicks;
    }

    public int getNbdivision() {
        return nbdivision;
    }

    public List<Note> getListOfNotes() {
        return listOfNotes;
    }



    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Beat{" +
                "nbOfTicks=" + nbOfTicks +
                ", listOfNotes=" + listOfNotes +
                ", nbdivision=" + nbdivision +
                '}';
    }

    public void setListOfNotes(List<Note> listOfNotes) {
        this.listOfNotes = listOfNotes;
    }

    public void addNote(Note noteToAdd, int division) {
        listOfNotes.add(noteToAdd);
    }
}

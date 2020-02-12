package fr.polytech.rythmml.beat;

import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class Beat {
    int nbOfTicks;
    List<Note> listOfNotes;

    public Beat(int nbOfTicks, List<Note> listOfNotes){
        this.nbOfTicks = nbOfTicks;
        this.listOfNotes = new ArrayList<>(listOfNotes);
    }

    public int getNbOfTicks() {
        return nbOfTicks;
    }

    public List<Note> getListOfNotes() {
        return listOfNotes;
    }

    @Override
    public String toString() {
        return "Beat{" +
                "nbOfTicks=" + nbOfTicks +
                ", listOfNotes=" + listOfNotes +
                '}';
    }
}

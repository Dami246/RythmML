package fr.polytech.rythmml.beat;

import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class BeatBuilder {
    int nbOfTicks;
    int nbdivision;
    List<Note> listOfNotes;

    public BeatBuilder() {
        listOfNotes = new ArrayList<>();
    }

    public Beat build() {
        return new Beat(nbOfTicks, nbdivision, listOfNotes);
    }

    public BeatBuilder setNbOfTicks(int nbOfTicks) {
        this.nbOfTicks = nbOfTicks;
        return this;
    }

    public BeatBuilder setNbDivision(int nbdivision) {
        this.nbdivision = nbdivision;
        return this;
    }

    public BeatBuilder setListOfNotes(List<Note> listOfNotes) {
        this.listOfNotes = listOfNotes;
        return this;
    }

    public BeatBuilder addNote(Note note) {
        try {
            this.listOfNotes.add((Note) note.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return this;
    }
}


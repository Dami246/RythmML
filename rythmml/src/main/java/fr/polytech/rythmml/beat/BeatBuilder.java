package fr.polytech.rythmml.beat;

import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class BeatBuilder {
    int nbOfTicks;
    List<Note> listOfNotes;

    public BeatBuilder(){
        listOfNotes = new ArrayList<>();
    }

    public Beat build() {
        return new Beat(nbOfTicks,listOfNotes);
    }

    public BeatBuilder setNbOfTicks(int nbOfTicks) {
        this.nbOfTicks = nbOfTicks;
        return this;
    }

    public BeatBuilder setListOfNotes(List<Note> listOfNotes) {
        this.listOfNotes = listOfNotes;
        return this;
    }

    public BeatBuilder addNote(Note note) {
        this.listOfNotes.add(note);
        return this;
    }
}


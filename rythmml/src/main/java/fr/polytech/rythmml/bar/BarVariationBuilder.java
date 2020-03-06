package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.Utils.PrettyPrinter;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class BarVariationBuilder {

    Bar referenceBar;
    Bar clonedBar;

    List<Beat> listOfBeats;

    public BarVariationBuilder(Bar bar) {
        listOfBeats = new ArrayList<>();
        referenceBar = bar;
        try {
            clonedBar = (Bar) referenceBar.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Bar build() {
        return clonedBar;
    }

    public BarVariationBuilder replaceNote(Note oldNote, Note newNote) {
        for (Beat beat : clonedBar.listOfBeats) {
            for (Note note : beat.getListOfNotes()) {
                if (note.equals(oldNote)) {
                    note.setNoteValue(newNote.getNoteValue());
                }
            }
        }
        return this;
    }

    public BarVariationBuilder removeNote(Note toRemoveNote) {
        for (Beat beat : clonedBar.listOfBeats) {
            beat.getListOfNotes().removeIf(note -> note.equals(toRemoveNote));
        }
        return this;
    }

    public BarVariationBuilder replaceNoteInSpecificBeat(int beatNumber, Note oldNote, Note newNote)  {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : clonedBar.listOfBeats) {
            for (Note note : beat.getListOfNotes()) {
                if (realBeatNumber == counter) {
                    if (note.equals(oldNote)) {
                        note.setNoteValue(newNote.getNoteValue());
                    }
                }
            }
            counter++;
        }
        return this;
    }

    public BarVariationBuilder removeNoteInSpecificBeat(int beatNumber, Note noteToRemove)  {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : clonedBar.listOfBeats) {
            if (realBeatNumber == counter) {
                beat.getListOfNotes().removeIf(note -> note.equals(noteToRemove));
            }
            counter++;
        }
        return this;
    }

    public BarVariationBuilder addNoteInSpecificBeat(int beatNumber, Note noteToAdd, int division)  {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : clonedBar.listOfBeats) {
            if (realBeatNumber == counter) {
                noteToAdd.setDivision(division);
                beat.addNote(noteToAdd, division);
            }
            counter++;
        }
        return this;
    }
}

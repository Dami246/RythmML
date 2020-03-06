package fr.polytech.rythmml.bar;

import fr.polytech.rythmml.Utils.PrettyPrinter;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class BarVariationBuilder {

    Bar referenceBar;
    List<Beat> listOfBeats;

    public BarVariationBuilder(Bar bar) {
        listOfBeats = new ArrayList<>();
        referenceBar = bar;
    }

    public Bar build() {
        return new Bar(listOfBeats);
    }

    public BarVariationBuilder replaceNote(Note oldNote, Note newNote) {
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = null;
            try {
                newBeat = (Beat) beat.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            for (Note note : newBeat.getListOfNotes()) {
                if (note.equals(oldNote)) {
                    note.setNoteValue(newNote.getNoteValue());
                }
            }
            listOfBeats.add(newBeat);
        }
        return this;
    }

    public BarVariationBuilder removeNote(Note toRemoveNote) {
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = null;
            try {
                newBeat = (Beat) beat.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            newBeat.getListOfNotes().removeIf(note -> note.equals(toRemoveNote));
            listOfBeats.add(newBeat);
        }
        return this;
    }

    public BarVariationBuilder replaceNoteInSpecificBeat(int beatNumber, Note oldNote, Note newNote)  {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = null;
            try {
                newBeat = (Beat) beat.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            for (Note note : newBeat.getListOfNotes()) {
                if (realBeatNumber == counter) {
                    if (note.equals(oldNote)) {
                        System.out.println("find one");
                        note.setNoteValue(newNote.getNoteValue());
                    }
                }
            }
            counter++;
            listOfBeats.add(newBeat);
        }
        return this;
    }

    public BarVariationBuilder removeNoteInSpecificBeat(int beatNumber, Note noteToRemove)  {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = null;
            try {
                newBeat = (Beat) beat.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (realBeatNumber == counter) {
                newBeat.getListOfNotes().removeIf(note -> note.equals(noteToRemove));
            }

            listOfBeats.add(newBeat);
            counter++;
        }
        return this;
    }

    public BarVariationBuilder addNoteInSpecificBeat(int beatNumber, Note noteToAdd, int division)  {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = null;
            try {
                newBeat = (Beat) beat.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (realBeatNumber == counter) {
                noteToAdd.setDivision(division);
                newBeat.addNote(noteToAdd, division);
            }
            listOfBeats.add(newBeat);
            counter++;
        }
        return this;
    }
}

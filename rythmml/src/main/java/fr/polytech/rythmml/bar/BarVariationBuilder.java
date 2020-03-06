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

    public BarVariationBuilder replaceNote(Note oldNote, Note newNote) throws CloneNotSupportedException {
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = (Beat) beat.clone();
            for (Note note : newBeat.getListOfNotes()) {
                if (note.equals(oldNote)) {
                    note.setNoteValue(newNote.getNoteValue());
                }
            }
            listOfBeats.add(newBeat);
        }
        return this;
    }

    public BarVariationBuilder removeNote(Note toRemoveNote) throws CloneNotSupportedException {
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = (Beat) beat.clone();
            newBeat.getListOfNotes().removeIf(note -> note.equals(toRemoveNote));
            listOfBeats.add(newBeat);
        }
        return this;
    }

    public BarVariationBuilder replaceNoteInSpecificBeat(int beatNumber, Note oldNote, Note newNote) throws CloneNotSupportedException {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = (Beat) beat.clone();
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

    public BarVariationBuilder removeNoteInSpecificBeat(int beatNumber, Note noteToRemove) throws CloneNotSupportedException {
        int realBeatNumber = beatNumber - 1;
        int counter = 0;
        for (Beat beat : referenceBar.listOfBeats) {
            Beat newBeat = (Beat) beat.clone();
            if (realBeatNumber == counter) {
                newBeat.getListOfNotes().removeIf(note -> note.equals(noteToRemove));
            }

            listOfBeats.add(newBeat);
            counter++;
        }
        return this;
    }
}

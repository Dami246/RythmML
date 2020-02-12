package fr.polytech.rythmml.Utils;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.note.Note;

public class PrettyPrinter {

    static public String prettyPrintNote(Note note){
        return note.getNoteValue().name();
    }

    static public String prettyPrintBeat(Beat beat){
        StringBuilder obeat = new StringBuilder();
        for(Note note : beat.getListOfNotes()){
            obeat.append(prettyPrintNote(note));
            obeat.append(" ");
        }
        return obeat.toString();
    }

    static public String PrettyPrintBar(Bar bar){
        StringBuilder oBar = new StringBuilder();
        for(Beat beat : bar.getListOfBeats()){
            oBar.append(prettyPrintBeat(beat));
            oBar.append("| ");
        }
        return oBar.toString();
    }


}

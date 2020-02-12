package fr.polytech.rythmml.Utils;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.pattern.Pattern;

public class PrettyPrinter {

    private static final String PATTERNS_SEPARATOR = "_____________________________";
    private static final String BARS_SEPARATOR = "| ";

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

    static public String prettyPrintBar(Bar bar){
        StringBuilder oBar = new StringBuilder();
        for(Beat beat : bar.getListOfBeats()){
            oBar.append(prettyPrintBeat(beat));
            oBar.append(BARS_SEPARATOR);
        }
        return oBar.toString();
    }

    static public String prettyPrintPattern(Pattern pattern) {
        StringBuilder oPattern = new StringBuilder();
        int barListIndex = 0;
        int barListRepetitionIndex = 0;

        for ( barListIndex = 0; barListIndex < pattern.getBarList().size() && barListRepetitionIndex < pattern.getBarsRepetitionList().size();  ) {
            barListIndex += pattern.getBarsRepetitionList().get(barListRepetitionIndex);
            oPattern.append(prettyPrintBar(
                    pattern.getBarList().get(barListIndex-1)))
                    .append("  x")
                    .append(pattern.getBarsRepetitionList().get(barListRepetitionIndex++))
                    .append("\n");
        }

        return oPattern.append(PATTERNS_SEPARATOR).toString();
    }




}


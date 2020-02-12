package fr.polytech.rythmml.music;

import fr.polytech.rythmml.note.notevalue.NoteValue;
import fr.polytech.rythmml.section.Section;

import java.util.List;

public class Music {

    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    private String title;
    private String author;

    private Section section;


    public Music(String title, String author, Section section) {
        this.title = title;
        this.author = author;
        this.section = section;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public NoteValue getNoteValue() {
        return noteValue;
    }

    public Section getSection() {
        return section;
    }
}

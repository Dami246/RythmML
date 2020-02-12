package fr.polytech.rythmml.music;

import fr.polytech.rythmml.beat.BeatBuilder;
import fr.polytech.rythmml.note.notevalue.NoteValue;
import fr.polytech.rythmml.section.Section;

public class MusicBuilder {
    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    private String title;
    private String author;
    private Section section;

    public MusicBuilder() {}

    public Music build() {
        return new Music(this.title, this.author, this.section);
    }

    public MusicBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public MusicBuilder setNoteValue(NoteValue noteValue) {
        this.noteValue = noteValue;
        return this;
    }

    public MusicBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MusicBuilder setSection(Section section) {
        this.section = section;
        return this;
    }


}

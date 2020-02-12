package fr.polytech.rythmml.music;

import fr.polytech.rythmml.midi.MIDIPlayable;
import fr.polytech.rythmml.note.notevalue.NoteValue;
import fr.polytech.rythmml.section.Section;

import java.util.List;

public class Music implements MIDIPlayable {

    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    private String title;
    private String author;
<<<<<<< HEAD
    private Section section;
=======
    private List<Section> sections;
>>>>>>> master


    public Music(String title, String author, List<Section> sections) {
        this.title = title;
        this.author = author;
        this.sections = sections;
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

<<<<<<< HEAD
    public Section getSection() {
        return section;
    }

    public int getTempo(){
        return 0;
    }

    public int getNbBar(){
        return 0;
    }

=======
>>>>>>> master

    @Override
    public String toString() {
        return "Music{" +
                "noteValue=" + noteValue +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void play() {
        for (Section section: sections) {
            section.play();
        }
    }
}

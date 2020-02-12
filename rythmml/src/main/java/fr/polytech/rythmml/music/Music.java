package fr.polytech.rythmml.music;

import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.notevalue.NoteValue;
import fr.polytech.rythmml.section.Section;

import java.util.List;

public class Music implements MIDIVisitable {

    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    private String title;
    private String author;
    private List<Section> sections;


    public Music(String title, String author, List<Section> sections) {
        this.title = title;
        this.author = author;
        this.sections = sections;
    }

    public String getAuthor() {
        return author;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public String getTitle() {
        return title;
    }

    public NoteValue getNoteValue() {
        return noteValue;
    }

    public int getTempo(){
        return 0;
    }

    public int getNbBar(){
        return 0;
    }

    @Override
    public String toString() {
        return "Music{" +
                "noteValue=" + noteValue +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}

package fr.polytech.rythmml.music;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.beat.Beat;
import fr.polytech.rythmml.beat.BeatBuilder;
import fr.polytech.rythmml.note.Note;
import fr.polytech.rythmml.note.notevalue.NoteValue;
import fr.polytech.rythmml.pattern.Pattern;
import fr.polytech.rythmml.section.Section;

import java.util.ArrayList;
import java.util.List;

public class MusicBuilder {
    // https://riptutorial.com/java/example/2746/enum-polymorphism-pattern
    NoteValue noteValue;

    private String title;
    private String author;
    private List<Section> sections = new ArrayList<>();

    public MusicBuilder() {}

    public Music build() {
        return new Music(this.title, this.author, this.sections);
    }

    public MusicBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public MusicBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MusicBuilder addSection(Section section) {
        this.sections.add(section);
        return this;
    }

    public MusicBuilder prepare(){
        // for every section
        for (int isection = 0; isection < sections.size(); isection++) {
            // for every ipattern in the section
            Section section = sections.get(isection);
            for (int ipattern = 0; ipattern < section.getPatternList().size(); ipattern++) {
                // for every bar in the pattern
                Pattern pattern = section.getPatternList().get(ipattern);
                for (int ibar = 0; ibar < pattern.getBarList().size(); ibar++) {
                    // for every bar in the pattern
                    Bar bar = pattern.getBarList().get(ibar);
                    for (int ibeat = 0; ibeat < bar.getListOfBeats().size(); ibeat++) {
                        // for every beat in the bar
                        Beat beat = bar.getListOfBeats().get(ibeat);
                        for (int inote = 0; inote < beat.getListOfNotes().size(); inote++) {
                            // for every note in the beat
                            Note note = beat.getListOfNotes().get(inote);
                            int pos = ibar * bar.getListOfBeats().size() * 1000;
                            pos += ibeat * 1000;
                            pos += beat.getNbdivision() * 1000;
                        }
                    }
                }
            }
        }
        return this;
    }
}

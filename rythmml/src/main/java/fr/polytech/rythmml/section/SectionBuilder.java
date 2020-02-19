package fr.polytech.rythmml.section;

import fr.polytech.rythmml.pattern.Pattern;

import java.util.ArrayList;
import java.util.List;

public class SectionBuilder {

    List<Pattern> patternList;

    public SectionBuilder() {
        this.patternList = new ArrayList<>();
    }

    public Section build() { return new Section(this.patternList);}

    public SectionBuilder setPatternList(List<Pattern> patternList) {
        this.patternList = patternList;
        return this;
    }

    public SectionBuilder addPattern(Pattern pattern) {
        try {
            this.patternList.add((Pattern)pattern.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return this;
    }

}

package fr.polytech.rythmml.section;

import fr.polytech.rythmml.pattern.Pattern;

import java.util.List;

public class SectionBuilder {

    List<Pattern> patternList;

    public SectionBuilder() {}

    public Section build() { return new Section(this.patternList);}

    public void setPatternList(List<Pattern> patternList) {
        this.patternList = patternList;
    }

    public void addPattern(Pattern pattern) {
        this.patternList.add(pattern);
    }

}

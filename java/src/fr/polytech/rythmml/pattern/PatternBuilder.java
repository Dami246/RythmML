package fr.polytech.rythmml.pattern;

import java.util.List;

public class PatternBuilder {
    List<Bar> barList;

    public PatternBuilder() {}

    public Pattern build() {
        return new Pattern(this.barList);
    }

    public void setBarList(List<Bar> barList) {
        this.barList = barList;
    }
}

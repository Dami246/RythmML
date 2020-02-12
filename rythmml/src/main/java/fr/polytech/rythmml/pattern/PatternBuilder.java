package fr.polytech.rythmml.pattern;

import fr.polytech.rythmml.bar.Bar;

import java.util.List;

public class PatternBuilder {
    List<Bar> barList;

    public PatternBuilder() {}

    public Pattern build() {
        return new Pattern(this.barList);
    }

    public PatternBuilder setBarList(List<Bar> barList) {
        this.barList = barList;
        return this;
    }

    public PatternBuilder addBar(Bar bar) {
        this.barList.add(bar);
        return this;
    }

    public PatternBuilder addRepeatedBar(Bar bar, int nbRepetition) {
        for (int i = 0 ; i < nbRepetition ; i ++) {
            this.barList.add(bar);
        }
        return this;
    }
}

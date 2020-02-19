package fr.polytech.rythmml.pattern;

import fr.polytech.rythmml.bar.Bar;

import java.util.ArrayList;
import java.util.List;

public class PatternBuilder {
    List<Bar> barList;
    List<Integer> barsRepetitionList;

    public PatternBuilder() {
        this.barList = new ArrayList<>();
        this.barsRepetitionList = new ArrayList<>();
    }

    public Pattern build() {
        return new Pattern(this.barList, this.barsRepetitionList);
    }

    public PatternBuilder setBarList(List<Bar> barList) {
        this.barList = barList;
        return this;
    }

    public PatternBuilder addBar(Bar bar) {
        this.barList.add(bar);
        this.barsRepetitionList.add(1);
        return this;
    }

    public PatternBuilder addRepeatedBar(Bar bar, int nbRepetition) {
        for (int i = 0 ; i < nbRepetition ; i ++) {
            this.barList.add(bar);
        }
        this.barsRepetitionList.add(nbRepetition);

        return this;
    }
}


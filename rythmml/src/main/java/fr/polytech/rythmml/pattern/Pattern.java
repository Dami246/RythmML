package fr.polytech.rythmml.pattern;

import fr.polytech.rythmml.bar.Bar;

import java.util.List;

public class Pattern {
    private List<Bar> barList;
    private List<Integer> barsRepetitionList;

    public Pattern(List<Bar> barList, List<Integer> barsRepetitionList) {
        this.barList = barList;
        this.barsRepetitionList = barsRepetitionList;
    }

    public List<Bar> getBarList() {
        return barList;
    }

    public List<Integer> getBarsRepetitionList() { return barsRepetitionList; }

    public Bar getBarByIndex(int i) {
        try {
            return this.barList.get(i);
        }
        catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Pattern{" +
                "barList=" + barList +
                '}';
    }
}


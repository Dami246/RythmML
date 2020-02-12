package fr.polytech.rythmml.pattern;

import fr.polytech.rythmml.bar.Bar;

import java.util.List;

public class Pattern {
    List<Bar> barList;

    public Pattern(List<Bar> barList) {
        this.barList = barList;
    }

    public List<Bar> getBarList() {
        return barList;
    }

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

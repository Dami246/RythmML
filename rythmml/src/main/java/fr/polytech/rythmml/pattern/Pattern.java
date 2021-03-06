package fr.polytech.rythmml.pattern;

import fr.polytech.rythmml.bar.Bar;
import fr.polytech.rythmml.midi.MIDIVisitable;
import fr.polytech.rythmml.midi.MIDIVisitor;
import fr.polytech.rythmml.note.Note;

import java.util.ArrayList;
import java.util.List;

public class Pattern implements MIDIVisitable, Cloneable {
    private List<Bar> barList;
    private List<Integer> barsRepetitionList;

    public Pattern(List<Bar> barList, List<Integer> barsRepetitionList) {
        this.barList = barList;
        this.barsRepetitionList = barsRepetitionList;
    }

    public Object clone() throws CloneNotSupportedException{
        Pattern newP = (Pattern)super.clone();
        newP.barList = new ArrayList<>();
        for (Bar b: barList) {
            newP.barList.add((Bar)b.clone());
        }
        return newP;
    }

    public List<Bar> getBarList() {
        return barList;
    }
//
//    public List<Bar> getRealBarList(){
//        List<Bar> realBarList = new ArrayList<>();
//        for (int i=0; i< barList.size(); ++i) {
//            int nbRep = barsRepetitionList.get(i);
//            for (int r=0; r < nbRep; ++r){
//                realBarList.add(barList.get(i));
//            }
//        }
//        return realBarList;
//    }

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

    @Override
    public void accept(MIDIVisitor visitor) {
        visitor.visit(this);
    }
}


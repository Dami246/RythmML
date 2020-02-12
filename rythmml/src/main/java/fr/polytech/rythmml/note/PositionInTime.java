package fr.polytech.rythmml.note;

public class PositionInTime {

    static int position = 1;
    public int toTick() {
        int previousPosition = position;
        position+=10;
        return previousPosition; // TODO : temp
    }
}

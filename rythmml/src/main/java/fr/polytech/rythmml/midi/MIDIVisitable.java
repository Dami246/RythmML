package fr.polytech.rythmml.midi;


public interface MIDIVisitable {
    void accept(MIDIVisitor visitor);
}

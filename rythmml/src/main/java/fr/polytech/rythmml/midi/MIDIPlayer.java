package fr.polytech.rythmml.midi;

import fr.polytech.rythmml.note.Note;

import javax.sound.midi.*;

public class MIDIPlayer {

    private static Sequencer sequencer;
    private static Sequence sequence;
    private static Track track;
    private static int resolution;
    private static float tempo;

    static {
        try {
            sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void createEvent(int type, Note note, long tick) {
        ShortMessage message = new ShortMessage();

        try {
            //9 == Drum channel
            message.setMessage(type, 9, note.getNoteNumber(), note.getVelocity());
            MidiEvent event = new MidiEvent(message, tick);
            track.add(event);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void createSequence(int resolution){
        MIDIPlayer.resolution = resolution;
        try {
            MIDIPlayer.sequence = new Sequence(Sequence.PPQ, resolution);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        MIDIPlayer.track = sequence.createTrack();
    }

    public static void setTempoBPM(float bpm){
        tempo = bpm;
    }

    public static void playSequence(){
        try {
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(tempo);
            int durationOfTheTrackMS = 40000; //TODO : TEMP
            sequencer.start();
            Thread.sleep(durationOfTheTrackMS);
        }
        catch (Exception e)  {
            e.printStackTrace();
        }
        sequencer.stop();
        sequencer.close();

    }
}

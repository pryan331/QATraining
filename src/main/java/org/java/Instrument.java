package org.java;

public class Instrument {
    int id;
    String chord;
    String volume;
    public Instrument(int id, String volume, String chord){
        this.id = id;
        this.chord = chord;
        this.volume = volume;
    }
    public void attributes(){
        System.out.println("id: "+ id + " Chord: " + chord + " Volume: " + volume);
    }
    public static void main(String[] args) {
        Instrument guitar = new Instrument(1, "Loud", "G");
        System.out.println();
        Instrument violin = new Instrument(2, "Soft", "C");
        guitar.attributes();
        violin.attributes();

        BassGuitar bg = new BassGuitar();
        String result = bg.tune("");
        System.out.println(result);

        Guitar fender = new Guitar(3, "Medium", "B");
        fender.attributes();
        fender.play();

        Violin yamaha = new Violin(5,"soft", "D");
        yamaha.attributes();
        yamaha.play();
    }

}
class Guitar extends Instrument{
    //int id, String volume, String chord
    Instrument g = new Instrument(4, "Loud", "A");

    public Guitar(int id, String volume, String chord) {
        super(id, volume, chord);
    }
    public void play(){
        System.out.println("Someone is playing the guitar.");
    }
}
class Violin extends Instrument {

    public Violin(int id, String volume, String chord) {
        super(id, volume, chord);
    }
    public void play(){
        System.out.println("Someone is playing the violin.");
    }
}
class GetReady {
    String tune(String pitch) {
        return pitch;
    }
}

class BassGuitar{
    GetReady gr;

    String tune(String pitch){
        gr = new GetReady();
        String guitarString = gr.tune("tightening string");
        return guitarString;
    }
}

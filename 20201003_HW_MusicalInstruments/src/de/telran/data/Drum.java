package de.telran.data;

public class Drum implements Playable {
    private String name;
    private int size;

    public Drum(String name) {
        this.name = name;
    }

    public Drum(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Plays this instrument with these characteristics: "  + name + ", with: " + size +" - size");
    }
}

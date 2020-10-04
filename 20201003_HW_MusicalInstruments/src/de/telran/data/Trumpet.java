package de.telran.data;

public class Trumpet implements Playable {
    private String name;
    private int diameter;

    public Trumpet(String name) {
        this.name = name;
    }

    public Trumpet(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println( "Plays this instrument with these characteristics: " + name + ", with: " + diameter + " - diametr");
    }
}

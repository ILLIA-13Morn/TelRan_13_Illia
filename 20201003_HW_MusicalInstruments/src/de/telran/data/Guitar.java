package de.telran.data;

public class Guitar implements Playable {
    private String name;
    private int numberOfStrings;

    public Guitar(String name) {
        this.name = name;
    }

    public Guitar(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Play this instrument with these characteristics: " +  name + ", with: " + numberOfStrings + " - strings");
    }


}

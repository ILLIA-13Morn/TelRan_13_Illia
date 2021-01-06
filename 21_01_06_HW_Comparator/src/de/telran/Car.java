package de.telran;

public class Car  implements Comparable<Car>{

    private int manufactureYear;
    private String model;
    private int maxSpeed;
    private int race;

    public Car(int manufactureYear, String model, int maxSpeed, int race) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.race = race;
    }

    @Override
    public int compareTo(Car o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRace() {
        return race;
    }


    @Override
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", race=" + race +
                '}';
    }

}

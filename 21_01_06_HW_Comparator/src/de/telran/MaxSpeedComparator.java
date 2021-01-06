package de.telran;

import java.util.Comparator;

public class MaxSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getMaxSpeed() - o1.getMaxSpeed();
    }
}

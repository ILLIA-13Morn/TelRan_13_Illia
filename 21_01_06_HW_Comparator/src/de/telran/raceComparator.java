package de.telran;

import java.util.Comparator;

public class raceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getRace() - o2.getRace();
    }
}

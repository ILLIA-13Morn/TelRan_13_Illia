package de.telran;

import java.util.Comparator;

public class manufactureYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getManufactureYear() - o1.getManufactureYear();
    }
}

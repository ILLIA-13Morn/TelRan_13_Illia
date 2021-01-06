package de.telran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car koenigseggAgeraRS = new Car(2012, "Koenigsegg Agera RS", 456, 15000);
        Car sscUltimateAeroXT = new Car(2018, "SSC Ultimate Aero XT", 482, 20000);
        Car bugattiVeyronSuperSport = new Car(2014, "Bugatti Veyron Super Sport", 434, 30000);
        Car mcLarenF1 = new Car(2010, "McLaren F1", 386, 60000);

        cars.add(koenigseggAgeraRS);
        cars.add(sscUltimateAeroXT);
        cars.add(bugattiVeyronSuperSport);
        cars.add(mcLarenF1);

        Comparator raceComparator = new raceComparator();
        Collections.sort(cars, raceComparator);
        System.out.println("The most valuable car by race  :" + cars);

        Comparator manufactureYear = new manufactureYearComparator();
        Collections.sort(cars, manufactureYear);
        System.out.println("The most valuable car by year  :" + cars);

        Comparator maxSpeed = new MaxSpeedComparator();
        Collections.sort(cars, maxSpeed);
        System.out.println("The most valuable car by speed  :" + cars);


    }
}

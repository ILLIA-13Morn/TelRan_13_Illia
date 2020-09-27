package de.telran.application;

import de.telran.data.Validator;
import de.telran.data.Date;

public class Application {
    public static void main(String[] args) {
        Date d = new Date(2020, 02, 29); // true
        Date d1 = new Date(2019, 02, 29); // false
        Date d2 = new Date(2020, 03, 31); //true
        Date d3 = new Date(2020, 04, 31); //false
        Date d4 = new Date(2100, 02, 29); // false
        Date d5 = new Date (2000, 02, 29); //true

    }
}

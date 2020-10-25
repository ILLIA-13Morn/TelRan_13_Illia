package de.telran;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Address addressOne = new Address("LinkeBrandstr.", 9);
        Address addressTwo = new Address("Köningsplatz", 15);
        Address addressThree = new Address("KongressAmPark", 2);

        Person personOne = new Person("Alex", addressOne);
        Person personTwo = new Person("Lena", addressTwo);
        Person personThree = new Person("Ivan", addressThree);

        ArrayList<Person> list = new ArrayList<>();

        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);

        System.out.println(list);
    }
}


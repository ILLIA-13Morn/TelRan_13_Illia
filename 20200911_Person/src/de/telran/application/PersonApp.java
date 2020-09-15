package de.telran.application;

import de.telran.data.Address;
import de.telran.data.Person;

import java.util.Arrays;

import static de.telran.data.Person.*;

public class PersonApp {
    public static void main(String[] args) {
        Address address1 = new Address("Berlin", "Kudamm",24);
        Person person1 = new Person("Vasya", 25,1.80,new Address("Kiew", "Chreschtic",35));
        person1.setName("Vasyliy");
        Person person2 = new Person("Alex", 24,1.70, new Address("London","Becker",28));
        Person person3 = new Person("Katya", 21,1.69, new Address("Moskow","Puschkinskaja",112));
        Person person4 = new Person("Mascha", 23,1.65,address1);
        Person person5 = new Person("Alex", 28,1.67,new Address("Paris","MonMartiue",233));
        Address address2 = person2.getAddress();
        /*System.out.println(person2.equals(person5));*/

        Person[] group = {person1, person2, person3, person4, person5};
        Person[] persons = {person1, person2, person3, person4,person5};


        Person.displayPersons(group);

        System.out.println("Age sorting :");

        Person.sortPersonByAge(group);
        Person.displayPersons(group);

        System.out.println("Age sorting2 :");

        Person.sortPersonByAge2(group);
        Person.displayPersons(group);

        System.out.println("Name sorting :");

        Person.sortPersonByName(group);
        Person.displayPersons(group);

        System.out.println("Height sorting :");

        Person.sortPersonByHeight(group);
        Person.displayPersons(group);

        System.out.println(findPersonByAddress(group, address1));

        System.out.println("The oldest person is " + getOldestPerson(persons).getAge());

        System.out.println("The longest name is " + displeyOldesPerson(persons).getName());


     /*    System.out.println(Arrays.toString(group));*/


    }
}

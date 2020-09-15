package de.telran.data;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private double height;
    private String city, street;
    private int houseNumber;
    private Address address;


    public Person(String name, int age, double height, Address address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
        else
            System.out.println("wrong age");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.height, height) == 0 &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name = '" + name +
                ", age = " + age +
                "height = '" + height;
    }

    public static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static Person getOldestPerson(Person[] persons) {
        Person p = null;
        int largest = Integer.MIN_VALUE;
        for (Person person : persons) {
            if (person.getAge() > largest) {
                largest = person.getAge();
                p = person;
            }
        }
        return p;
    }

    public static Person displeyOldesPerson(Person[] persons) {
        Person p = null;
        int largest = 0;
        for (Person person : persons) {
            if (person.getName().length() > largest) {
                largest = person.getName().length();
                p = person;
            }
        }
        return p;
    }

    private static int comparePersonByAge(Person p1, Person p2) {
        if (p1.age > p2.age)
            return 1;
        else if (p1.age < p2.age)
            return -1;
        return 0;
    }

    private int compareToPersonByAge(Person person) {
        if (this.age > person.age)
            return 1;
        else if (this.age < person.age)
            return -1;
        return 0;
    }

    private double comparePersonByHeight(Person person) {
        if (this.height > person.height)
            return 1;
        else if (this.height < person.height)
            return -1;
        return 0.0;
    }

    public static void sortPersonByHeight(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].comparePersonByHeight(persons[j + 1]) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByAge(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (comparePersonByAge(persons[j], persons[j + 1]) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByAge2(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByAge(persons[j + 1]) < 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].name.compareTo(persons[j + 1].name) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static Person findPersonByAddress(Person[] persons, Address address) {
        for (Person p : persons) {
            if (address.equals(p.address)) {
                return p;
            }
        }
       /* System.out.println("Person not found");*/
        return null;
    }

    public static void displayPersonByAddress(Person[] persons, Address address) {
        boolean flag = false;
        for (Person p : persons) {
            if (address.equals(p.address)) {
                System.out.println(p);
                flag = true;
            }
        }
        if(!flag)
        System.out.println("Person not found");
    }

}

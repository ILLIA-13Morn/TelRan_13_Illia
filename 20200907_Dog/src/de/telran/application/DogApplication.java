package de.telran.application;
import de.telran.data.Dog;

public class DogApplication {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("Scharik",3);

        /*System.out.println(dog1.getName());
        dog.setName("Bobik");
        System.out.println(dog.getName());
        dog.setName("Tusik");
        System.out.println(dog.getName());
        System.out.println(dog);
        dog.dogVoice();*/
        System.out.println(dog1.isDogStatus());
        dog1.dogSleep();
        dog1.display();
    }

}

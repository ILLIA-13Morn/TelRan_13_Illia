package de.telran;

public class Main {
    public static void main(String[] args) {
        StackMax stackMax = new StackMax();
        stackMax.addLast(15);
        stackMax.addLast(250);
        stackMax.addLast(4);
        stackMax.addLast(23);
        System.out.println(stackMax.getMax());
    }

}

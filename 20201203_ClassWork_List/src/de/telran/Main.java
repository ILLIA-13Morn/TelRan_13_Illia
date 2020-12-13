package de.telran;


import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        OurArrayList<String> strings = new OurArrayList<>();

        strings.addLast("Vasya");
        strings.addLast("Petya");
        strings.addLast("Alisa");

        Iterator<String> forwardIterator =  strings.forwardIterator();

        while (forwardIterator.hasNext()){
            System.out.print(forwardIterator.next() + " ");
        }

        Iterator <String> backwardIterator =  strings.backwardIterator();
        while (backwardIterator.hasNext()){
            System.out.print(backwardIterator.next() + " ");
        }

        String str1 = (String) strings.get(0);
        String str2 = (String) strings.get(1);


        String res = "";

        for (int i = 0; i < strings.size(); i++) {

            res += strings.get(i);

        }
    }
}

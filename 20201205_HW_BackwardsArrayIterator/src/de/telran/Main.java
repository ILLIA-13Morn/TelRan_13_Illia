package de.telran;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, -8, 0, 15};

        Iterator<Integer> backwardsArrayIterator = new BackwardsArrayIterator(array);

        while (backwardsArrayIterator.hasNext()) {
            int current = backwardsArrayIterator.next();
            System.out.println(current);
        }

    }
}

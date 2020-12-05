package de.telran;

import java.util.Iterator;

public class BackwardsArrayIterator implements Iterator<Integer> {
    private final int[] arrayToIterate;
    private int currentIndex;

    public BackwardsArrayIterator(int[] arrayToIterate) {
        this.arrayToIterate = arrayToIterate;
        this.currentIndex = arrayToIterate.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >=0;
    }

    @Override
    public Integer next() {
        return arrayToIterate[currentIndex--];
    }
}

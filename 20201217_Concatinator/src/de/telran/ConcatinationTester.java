package de.telran;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatinationTester {

    private iConcatenator concatenator;

    public ConcatinationTester (iConcatenator concatenator) {
        this.concatenator = concatenator;
    }
        public long test (int times, String text){
            String [] arrayToTest = Array (times, text);

            long now = System.currentTimeMillis();
            concatenator.concatenate(arrayToTest);
            return System.currentTimeMillis() - now;

        }
        private String [] Array (int times, String text){
            String [] res = new String[times];
            Arrays.fill (res, text);
            return res;
        }
}

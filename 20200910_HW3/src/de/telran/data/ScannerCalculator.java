package de.telran.data;

import java.util.Arrays;

public class ScannerCalculator {

    public static int[] fillArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Userinteraction.getArrayElement();
        }
        return array;
    }

    public static int[] getArrayWithoutNumberToDelete(int[] arr, int number) {
        int count = 0;
        int[] newArr = new int[arr.length - 1];
        for (int j : arr) {
            if (number != j) {
                newArr[count] = j;
                count++;
            }
        }
        return newArr;
    }

    public static boolean isNumberToDeleteInArray(int[] arr, int number) {
        for (int num : arr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
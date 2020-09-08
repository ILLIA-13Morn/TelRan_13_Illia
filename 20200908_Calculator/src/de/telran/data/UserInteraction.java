package de.telran.data;

import java.util.Scanner;

public class UserInteraction {
    private static Scanner scanner = new Scanner(System.in);

    public static double getParametr(){
        System.out.println("Enter namber, please");
        return scanner.nextDouble();
    }
    public static char operation() {
        System.out.println("Enter operation symbol, please");
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("wrong operation symbol, enter new please");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }
    public static double getRightDelimiter (double delimiter){
        while (delimiter == 0){
            System.out.println("Error.Enter another number");
            delimiter = scanner.nextDouble()
        }
        return delimiter;
    }
    public static void closeScanner
}

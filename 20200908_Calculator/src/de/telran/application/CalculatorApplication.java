package de.telran.application;

import de.telran.data.Calculator;
import de.telran.data.UserInteraction;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        double a = getParameter();
        double b = getParameter();
        char operation = UserInteraction.operation();
        Calculator.calculator(a,b,operation);
        UserInteraction.closeScanner();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, please");
        double a = scanner.nextDouble();
        System.out.println("Enter more number, please");
        double b = scanner.nextDouble();
        System.out.println("Enter operation symbol, please");
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/' ){
            System.out.println("wrong operation symbol, enter new please");
            operation =scanner.next().charAt(0);*/


    }
}

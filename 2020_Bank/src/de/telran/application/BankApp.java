package de.telran.application;

import de.telran.dao.Bank;
import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;

import java.util.Date;

public class BankApp {
    public static void main(String[] args) {
        Person client1 = new Person("Ivan","Ivanov",1978,"Moscow", Sex.MALE);
        Person client2 = new Person("Mascha","Maschina",1972,"Moscow", Sex.FEMALE);
        Person client3 = new Person("Petr","Petrov",1972,"Moscow", Sex.MALE);
        Person client4 = new Person("Nina","Ivanova",1972,"Moscow", Sex.FEMALE);
        Person client5 = new Person("Inna","Petrova",1972,"Moscow", Sex.FEMALE);
        Person client6 = new Person("Igor","Sokolov",1972,"Moscow", Sex.MALE);
        Person client7 = new Person("Anastasia","Kozlova",1972,"Moscow", Sex.FEMALE);


        BankAccount account1 = new BankAccount(client1, 2000);
        BankAccount account2 = new BankAccount(client2, 500);
        BankAccount account3 = new BankAccount(client3, 2000);
        BankAccount account4 = new BankAccount(client4, 5500);
        BankAccount account5 = new BankAccount(client5, 23000);
        BankAccount account6 = new BankAccount(client6, 5200);
        BankAccount account7 = new BankAccount(client7, 5400);


        Bank myBank = new Bank(100);

        myBank.addAccount(account1);
        myBank.addAccount(account2);
        myBank.addAccount(account3);
        myBank.addAccount(account4);
        myBank.addAccount(account5);
        myBank.addAccount(account6);
        myBank.addAccount(account7);


        myBank.displayAccounts();

        myBank.transferMoney(10100001,10100002,200);
        myBank.transferMoney(10100002,10100003,1000);

        myBank.getCountClientsPerSex();
        myBank.displayClientsPerSex(Sex.MALE);
        myBank.displayClientsPerSex(Sex.FEMALE);
        myBank.getClientPerSex(Sex.MALE);
        myBank.getClientPerSex(Sex.FEMALE);
    }

}

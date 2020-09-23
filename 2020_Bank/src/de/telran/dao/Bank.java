package de.telran.dao;

import de.telran.data.BankAccount;
import de.telran.data.Sex;
import de.telran.data.Person;

import java.util.Arrays;

public class Bank {
    private BankAccount[] accounts;
    private int size;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int checkAccount(int account) {
        for (int i = 0; i < size; i++) {
            if (account == accounts[i].getAccount()) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAccount(BankAccount account) {
        if (checkAccount(account.getAccount()) >= 0 || size >= accounts.length) {
            return false;
        }
        accounts[size] = account;
        size++;
        return true;
    }

    public boolean closeAccount(int account) {
        int index = checkAccount(account);
        if (index < 0) {
            return false;
        }
        accounts[index] = accounts[size - 1];
        size--;
        return true;
    }

    public void displayAccounts() {
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
            System.out.println("----------------------------------------------");

        }
    }

    public BankAccount[] getExistingAccounts() {
        BankAccount[] allAccounts = new BankAccount[size];
        for (int i = 0; i < size; i++) {
            allAccounts[i] = accounts[i];
        }
        return allAccounts;
    }

    public double getBalanceOfBank() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + accounts[i].getBalance();
        }
        return sum;
    }

    public boolean transferMoney(int accountFrom, int accountTo, double sum) {
        int indexFrom = checkAccount(accountFrom);
        if (indexFrom < 0) {
            System.out.println("Withdrawal account is incorrect, please check and try again ");
            return false;
        }
        int indexTo = checkAccount(accountTo);
        if (indexTo < 0) {
            System.out.println("Recipient account is incorrect, please check and try again ");
            return false;
        }
        if (!accounts[indexFrom].credit(sum)) {
            System.out.println("The transit is not possible,your balance is to low ");
            return false;
        }
        accounts[indexTo].debit(sum);
        System.out.println("your transition is finisched, see detail below ");
        System.out.println("-----------------------------------------");
        System.out.println(sum + "was transferred to " + accounts[indexTo].getClient().toStringName());
        System.out.println("your balance to " + accounts[indexFrom].getBalance());
        return true;

    }

    public void getCountClientsPerSex(){
        int males = 0;
        int females = 0;
        for (BankAccount account : this.getExistingAccounts()){
            Sex sex = account.getClient().getSex();
            if (sex.equals(Sex.MALE)){
                males += 1;
            } else if (sex.equals(Sex.FEMALE)) {
                females +=1;
            }
        }
        System.out.println("\nThere are "+males+" males and "+females+" females.\n");
    }

    public void displayClientsPerSex(Sex s){
        if (s.equals(Sex.MALE)){
            System.out.println("\n\nMale clients:\n");
        } else if (s.equals(Sex.FEMALE)) {
            System.out.println("\n\nFemale clients:\n");
        }
        for (BankAccount account : this.getExistingAccounts()){
            Person client = account.getClient();
            Sex sex = client.getSex();
            if (sex.equals(s)){
                System.out.println(client.toString());
            }
        }
    }

    public Person[] getClientPerSex(Sex s){
        Person[] clients = {};
        for (BankAccount account : this.getExistingAccounts()){
            Person client = account.getClient();
            Sex sex = client.getSex();
            if (sex.equals(s)){
                clients = Arrays.copyOf(clients, clients.length+1);
                clients[clients.length - 1] = client;
            }
        }

        System.out.println("\nFound and returned "+clients.length+" clients with sex "+s);
        return clients;
    }




}

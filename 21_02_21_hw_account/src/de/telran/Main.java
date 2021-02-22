package de.telran;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Account> balanceIsPositive = account -> account.getBalance() > 0;
        Predicate<Account> lockedBalance = account -> account.isLocked();
        Predicate<Account> accountIsRich = account -> account.getBalance() > 100000;

        Predicate <Account> accountIsCredible;
        accountIsCredible = accountIsRich.and(lockedBalance.negate());
    }
}

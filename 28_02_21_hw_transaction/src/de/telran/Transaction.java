package de.telran;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingLong;

public class Transaction {

    long sum;
    String account;

    public Transaction(long sum, String account) {
        this.sum = sum;
        this.account = account;
    }

    public long getSum() {
        return sum;
    }

    public String getAccount() {
        return account;
    }

    }


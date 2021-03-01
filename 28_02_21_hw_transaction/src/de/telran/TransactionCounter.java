package de.telran;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingLong;

public class TransactionCounter {
    public Map<String, Long> sumByAcc(List<Transaction> transactions) {
        return transactions.stream()
                .collect(
                        groupingBy(transaction -> transaction.getAccount(),summingLong(transaction1 -> transaction1.getSum())));

    }

}

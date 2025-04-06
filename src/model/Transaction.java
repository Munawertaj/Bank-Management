package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private static int idCounter = 0;
    private final int transactionId;
    private final double amount;
    private final String description;
    private final String timestamp;

    public Transaction(double amount, String description) {
        this.transactionId = ++idCounter;
        this.amount = amount;
        this.description = description;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId +
                " | Description: " + description +
                " | Amount: " + amount +
                " | Time: " + timestamp;
    }
}

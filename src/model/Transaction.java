package model;

import java.time.LocalDateTime;

public class Transaction {
    private static int transactionCounter = 1000;
    private int transactionId;
    private double amount;
    private String description;
    private LocalDateTime timestamp;

    public Transaction(double amount, String description) {
        this.transactionId = ++transactionCounter;
        this.amount = amount;
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[Txn ID: " + transactionId + "] , Amount: " + amount + ", Note: " + description + ", Timestamp: " + timestamp ;
    }
}

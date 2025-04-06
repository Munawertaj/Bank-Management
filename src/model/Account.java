package model;

import java.util.ArrayList;
import java.util.List;

public class Account{
    private static int accountCounter = 1000;
    private final int accountNumber;
    private double balance;
    private final Customer customer;
    private final List<Transaction> transactions;

    public Account(Customer customer) {
        this.accountNumber = ++accountCounter;
        this.customer = customer;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return customer.getName();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void increaseBalance(double amount) {
            balance += amount;
    }

    public boolean decreaseBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account Details:\n Name: " + getName() + "\n AccountNumber=" + accountNumber + "\n balance:" + balance + "\n";
    }
}

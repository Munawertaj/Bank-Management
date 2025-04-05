package model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static int accountCounter = 100000000;
    private int accountNumber;
    private double balance;
    private Customer customer;
    private List<Transaction> transactions;

    public Account(Customer customer, double balance) {
        this.accountNumber = ++accountCounter;
        this.customer = customer;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}

package service;

import model.Account;
import model.Transaction;
import view.TransactionView;

import java.util.List;

public class TransactionService {

    public void deposit(Account account, double amount) {
        account.increaseBalance(amount);
        Transaction transaction = new Transaction(amount, "Deposited to account.");
        account.addTransaction(transaction);
    }

    public boolean withdraw(Account account, double amount) {
        boolean success = account.decreaseBalance(amount);
        if (success) {
            Transaction transaction = new Transaction(amount, "Withdrawn from account.");
            account.addTransaction(transaction);
        }
        return success;
    }
}

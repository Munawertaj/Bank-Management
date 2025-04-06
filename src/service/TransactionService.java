package service;

import model.Account;
import model.Transaction;
import view.TransactionView;

import java.util.List;

public class TransactionService {

    public void deposit(Account account, double amount) {
        account.increaseBalance(amount);
        Transaction transaction = new Transaction(amount, "Deposited to account");
        account.addTransaction(transaction);
    }

}

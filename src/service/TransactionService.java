package service;

import model.Account;
import model.Transaction;

public class TransactionService {

    public void deposit(Account account, double amount) {
        account.increaseBalance(amount);
        Transaction transaction = new Transaction(amount, "Deposited");
        account.addTransaction(transaction);
    }

    public boolean withdraw(Account account, double amount) {
        boolean success = account.decreaseBalance(amount);

        if (success) {
            Transaction transaction = new Transaction(amount, "Withdrawn");
            account.addTransaction(transaction);
        }
        return success;
    }

    public boolean transfer(Account sender, Account receiver, double amount) {
        boolean success = sender.decreaseBalance(amount);

        if (success) {
            receiver.increaseBalance(amount);
            Transaction sentTxn = new Transaction(amount, "Sent to Account No: " + receiver.getAccountNumber());
            Transaction receivedTxn = new Transaction(amount, "Received From Account No: " + sender.getAccountNumber());
            sender.addTransaction(sentTxn);
            receiver.addTransaction(receivedTxn);
        }
        return success;
    }
}

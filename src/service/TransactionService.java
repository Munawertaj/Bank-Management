package service;

import exception.IllegalOperationException;
import exception.InsufficientFundsException;
import model.Account;
import model.Transaction;

public class TransactionService {

    public void deposit(Account account, double amount) {
        account.increaseBalance(amount);
        account.addTransaction(new Transaction(amount, "Deposited"));
    }

    public void withdraw(Account account, double amount) throws InsufficientFundsException {
        if (account.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        account.decreaseBalance(amount);
        account.addTransaction(new Transaction(amount, "Withdrawn"));
    }

    public void transfer(Account sender, Account receiver, double amount)
            throws InsufficientFundsException, IllegalOperationException {

        if (sender.getAccountNumber() == receiver.getAccountNumber()) {
            throw new IllegalOperationException("Illegal operation: Cannot transfer to the same account.");
        }

        if (sender.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient balance.");
        }

        sender.decreaseBalance(amount);
        receiver.increaseBalance(amount);

        sender.addTransaction(new Transaction(amount, "Sent to Account No: " + receiver.getAccountNumber()));
        receiver.addTransaction(new Transaction(amount, "Received from Account No: " + sender.getAccountNumber()));
    }
}

package service;

import exception.AccountNotFoundException;
import model.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<Integer, Account> accounts = new HashMap<>();

    public Account createAccount(model.Customer customer) {
        Account account = new Account(customer);
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    public Account getAccountByNumber(int accountNumber) throws AccountNotFoundException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account number " + accountNumber + " not found.");
        }
        return account;
    }
}

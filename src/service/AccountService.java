package service;

import model.Account;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private final List<Account> accountList = new ArrayList<>();

    public Account createAccount(Customer customer, double initialDeposit) {
        Account account = new Account(customer, initialDeposit);
        accountList.add(account);
        return account;
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}

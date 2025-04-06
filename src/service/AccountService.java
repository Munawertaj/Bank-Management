package service;

import model.Account;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private final List<Account> accountList = new ArrayList<>();

    public Account createAccount(Customer customer) {
        Account account = new Account(customer);
        accountList.add(account);
        return account;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}

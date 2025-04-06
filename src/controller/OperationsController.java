package controller;

import model.Account;
import model.Customer;
import model.Transaction;
import service.AccountService;
import service.CustomerService;
import service.TransactionService;
import view.CreateAccountView;
import view.DepositView;
import view.MessageView;
import view.TransactionView;

public class OperationsController {
    private final AccountService accountService;
    private final CustomerService customerService;
    private final TransactionService transactionService;

    public OperationsController() {
        this.accountService = new AccountService();
        this.customerService = new CustomerService();
        this.transactionService = new TransactionService();
    }

    public void createAccount() {
        String name = CreateAccountView.getCustomerName();
        double amount = CreateAccountView.getInitialDeposit();
        Customer customer = customerService.createCustomer(name);
        Account account = accountService.createAccount(customer);
        transactionService.deposit(account, amount);
        MessageView.showMessage(account + " has been created");
    }

    public void handleDeposit() {
        int accountNumber = DepositView.getAccountNumber();
        double amount = DepositView.getAmount();
        Account account = accountService.getAccountByNumber(accountNumber);

        if (account != null) {
            transactionService.deposit(account, amount);
            MessageView.showMessage("Deposit successful.");
        } else {
            MessageView.showMessage("Account not found.");
        }
    }

    public void showTransactions() {
        int accountNumber = TransactionView.getAccountNumber();
        Account account = accountService.getAccountByNumber(accountNumber);

        if (account != null) {
            TransactionView.showAllTransactions(account.getTransactions());
        } else {
            MessageView.showMessage("Account not found.");
        }
    }

}

package controller;

import exception.AccountNotFoundException;
import exception.IllegalOperationException;
import exception.InsufficientFundsException;
import model.Account;
import model.Customer;
import service.AccountService;
import service.CustomerService;
import service.TransactionService;
import view.*;

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
        MessageView.showMessage(account + "This account has been created successfully.");
    }

    public void handleDeposit() {
        try {
            int accountNumber = DepositView.getAccountNumber();
            double amount = DepositView.getAmount();
            Account account = accountService.getAccountByNumber(accountNumber);
            transactionService.deposit(account, amount);
            MessageView.showMessage("Amount: " + amount + " has been deposited successfully.");
        } catch (AccountNotFoundException e) {
            MessageView.showMessage(e.getMessage());
        }
    }

    public void handleWithdraw() {
        try {
            int accountNumber = WithdrawView.getAccountNumber();
            double amount = WithdrawView.getAmount();
            Account account = accountService.getAccountByNumber(accountNumber);
            transactionService.withdraw(account, amount);
            MessageView.showMessage("Amount: " + amount + " has been withdrawn successfully.");
        } catch (AccountNotFoundException | InsufficientFundsException e) {
            MessageView.showMessage(e.getMessage());
        }
    }

    public void showTransactions() {
        try {
            int accountNumber = TransactionView.getAccountNumber();
            Account account = accountService.getAccountByNumber(accountNumber);
            TransactionView.showAllTransactions(account.getTransactions());
        } catch (AccountNotFoundException e) {
            MessageView.showMessage(e.getMessage());
        }
    }

    public void handleTransfer() {
        try {
            int senderAccountNumber = TransferView.getSenderAccount();
            int receiverAccountNumber = TransferView.getReceiverAccount();
            double amount = TransferView.getAmount();

            Account sender = accountService.getAccountByNumber(senderAccountNumber);
            Account receiver = accountService.getAccountByNumber(receiverAccountNumber);
            transactionService.transfer(sender, receiver, amount);
            MessageView.showMessage("Amount: " + amount + " has been transferred successfully.");
        } catch (AccountNotFoundException | InsufficientFundsException | IllegalOperationException e) {
            MessageView.showMessage(e.getMessage());
        }
    }
}

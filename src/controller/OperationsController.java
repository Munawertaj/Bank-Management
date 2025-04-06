package controller;

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
        int accountNumber = DepositView.getAccountNumber();
        double amount = DepositView.getAmount();
        Account account = accountService.getAccountByNumber(accountNumber);

        if (account != null) {
            transactionService.deposit(account, amount);
            MessageView.showMessage("Amount: " + amount + " has been deposited successfully.");
        } else {
            MessageView.showMessage("Account not found.");
        }
    }

    public void handleWithdraw() {
        int accountNumber = WithdrawView.getAccountNumber();
        double amount = WithdrawView.getAmount();
        Account account = accountService.getAccountByNumber(accountNumber);

        if (account != null) {
            boolean success = transactionService.withdraw(account, amount);
            if (success) {
                MessageView.showMessage("Amount: " + amount + " has been withdrawn successfully.");
            } else {
                MessageView.showMessage("Insufficient balance.");
            }
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

    public void handleTransfer() {
        int senderAccountNumber = TransferView.getSenderAccount();
        int receiverAccountNumber = TransferView.getReceiverAccount();
        double amount = TransferView.getAmount();
        Account sender = accountService.getAccountByNumber(senderAccountNumber);
        Account receiver = accountService.getAccountByNumber(receiverAccountNumber);

        if (sender != null && receiver != null) {
            boolean success = transactionService.transfer(sender, receiver, amount);
            if (success) {
                MessageView.showMessage("Amount: " + amount + " has been transferred successfully.");
            }
            else {
                MessageView.showMessage("Insufficient balance.");
            }
        } else {
            MessageView.showMessage("Invalid sender or receiver account number.");
        }
    }
}

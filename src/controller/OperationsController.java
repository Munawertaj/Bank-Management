package controller;

import model.Account;
import model.Customer;
import service.AccountService;
import service.CustomerService;
import view.CreateAccountView;
import view.DashboardView;
import view.MessageView;

public class OperationsController {
    private final AccountService accountService;
    private final CustomerService customerService;

    public OperationsController() {
        this.accountService = new AccountService();
        this.customerService = new CustomerService();
    }

    public void createAccount() {
        String name = CreateAccountView.getCustomerName();
        double amount = CreateAccountView.getInitialDeposit();
        Customer customer = customerService.createCustomer(name);
        Account account = accountService.createAccount(customer, amount);
        MessageView.showMessage(account + " has been created");
    }
}

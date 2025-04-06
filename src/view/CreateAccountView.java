package view;

import util.InputValidator;

public class CreateAccountView {
    public static String getCustomerName() {
        return InputValidator.getValidName("Enter Customer Name: ");
    }

    public static double getInitialDeposit() {
        return InputValidator.getValidAmount("Enter Initial Deposit: ");
    }
}

package view;

import util.InputValidator;

public class DepositView {
    public static int getAccountNumber() {
        return InputValidator.getValidAccountNumber("Enter Account Number to Deposit: ");
    }

    public static double getAmount() {
        return InputValidator.getValidAmount("Enter Amount to Deposit: ");
    }
}

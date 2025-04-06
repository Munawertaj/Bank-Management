package view;


import util.InputValidator;

public class WithdrawView {
    public static int getAccountNumber() {
        return InputValidator.getValidAccountNumber("Enter Account Number to Withdraw: ");
    }

    public static double getAmount() {
        return InputValidator.getValidAmount("Enter Amount to Withdraw: ");
    }
}

package view;

import util.InputValidator;

public class TransferView {
    public static int getSenderAccount() {
        return InputValidator.getValidAccountNumber("Enter Sender Account Number: ");
    }

    public static int getReceiverAccount() {
        return InputValidator.getValidAccountNumber("Enter Receiver Account Number: ");
    }

    public static double getAmount() {
        return InputValidator.getValidAmount("Enter Amount to Transfer: ");
    }
}

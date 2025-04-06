package view;

import util.InputValidator;

public class TransferView {
    public static int getSenderAccount() {
        return InputValidator.getValidAccount("Enter Sender Account Number: ");
    }

    public static int getReceiverAccount() {
        return InputValidator.getValidAccount("Enter Receiver Account Number: ");
    }

    public static double getAmount() {
        return InputValidator.getValidAmount("Enter Amount to Transfer: ");
    }
}

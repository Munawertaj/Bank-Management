package view;

import java.util.Scanner;

public class TransferView {
    private static final Scanner input = new Scanner(System.in);

    public static int getSenderAccount() {
        System.out.print("Enter Sender Account Number: ");
        return input.nextInt();
    }

    public static int getReceiverAccount() {
        System.out.print("Enter Receiver Account Number: ");
        return input.nextInt();
    }

    public static double getAmount() {
        System.out.print("Enter Amount to Transfer: ");
        return input.nextDouble();
    }
}

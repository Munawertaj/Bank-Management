package view;

import java.util.Scanner;

public class DepositView {
    private static final Scanner input = new Scanner(System.in);

    public static int getAccountNumber() {
        System.out.print("Enter Account Number to Deposit: ");
        return input.nextInt();
    }

    public static double getAmount() {
        System.out.print("Enter Amount to Deposit: ");
        return input.nextDouble();
    }
}

package view;

import java.util.Scanner;

public class CreateAccountView {
    private static final Scanner input = new Scanner(System.in);

    public static String getCustomerName() {
        System.out.print("Enter Customer Name: ");
        return input.nextLine();
    }

    public static double getInitialDeposit() {
        System.out.print("Enter Initial Deposit: ");
        return input.nextDouble();
    }


}

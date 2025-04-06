package view;

import java.util.Scanner;

public class DashboardView {
    private static final Scanner input = new Scanner(System.in);

    public static int showMenu() {
        System.out.println("\n--- Welcome to Bank Account Management System ---");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Transfer Funds");
        System.out.println("5. Display Transactions History");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }
}

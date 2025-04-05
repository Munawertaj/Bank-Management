package view;

import java.util.Scanner;

public class DashboardView {
    private static final Scanner input = new Scanner(System.in);

    public static int showMenu() {
        System.out.println("\n--- Welcome to Bank Management System ---");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. View Transactions");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }
}

package view;

import util.InputValidator;

public class DashboardView {

    public static int showMenu() {
        while (true) {
            System.out.println("\n--- Welcome to Bank Account Management System ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Transfer Funds");
            System.out.println("5. Display Transaction History");
            System.out.println("6. Exit");

            return InputValidator.getValidChoice("Enter your choice (1-6): ");
        }
    }
}

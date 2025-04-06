package util;

import java.util.Scanner;

public class InputValidator {
    private static final Scanner input = new Scanner(System.in);

    private static String getInput(String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }

    public static int getValidAccount(String prompt) {
        while (true) {
            String value = getInput(prompt);
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid account number!!!");
            }
        }
    }

    public static int getValidChoice(String prompt) {
        while (true) {
            String value = getInput(prompt);
            try {
                int choice = Integer.parseInt(value);
                if (choice >= 1 && choice <= 6) {
                    return choice;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid menu choice (1–6) !!!");
            }
        }
    }

    public static double getValidAmount(String prompt) {
        while (true) {
            String value = getInput(prompt);
            try {
                double amount = Double.parseDouble(value);
                if (amount >= 0) {
                    return amount;
                } else {
                    System.out.println("Amount cannot be negative!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric amount!!!");
            }
        }
    }

    public static String getValidName(String prompt) {
        while (true) {
            String name = getInput(prompt);
            if (!name.isEmpty()) {
                return name;
            } else {
                System.out.println("Name cannot be empty!!!");
            }
        }
    }
}

package util;

import java.util.Scanner;

public class InputValidator {
    private static final Scanner input = new Scanner(System.in);

    public static int getValidAccountNumber(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double getValidAmount(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(input.nextLine().trim());
                if (value < 0) {
                    System.out.println("Amount cannot be negative.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid amount.");
            }
        }
    }

    public static String getValidName(String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }
}

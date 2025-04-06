package view;

import model.Transaction;

import java.util.List;
import java.util.Scanner;

public class TransactionView {
    private static final Scanner input = new Scanner(System.in);

    public static int getAccountNumber() {
        System.out.print("Enter Account Number to View Transactions: ");
        return input.nextInt();
    }

    public static void showAllTransactions(List<Transaction> transactions) {
        System.out.println("\n--- Transaction History ---");
        for (Transaction txn : transactions) {
            System.out.println(txn);
        }
    }
}

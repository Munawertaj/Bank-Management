package view;

import model.Transaction;
import util.InputValidator;

import java.util.List;

public class TransactionView {

    public static int getAccountNumber() {
        return InputValidator.getValidAccountNumber("Enter Account Number to View Transactions: ");
    }

    public static void showAllTransactions(List<Transaction> transactions) {
        System.out.println("\n--- Transaction History ---");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

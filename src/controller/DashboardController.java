package controller;

import view.DashboardView;
import view.MessageView;

public class DashboardController {
    private final OperationsController operationsController;

    public DashboardController() {
        this.operationsController = new OperationsController();
    }

    public void start() {
        boolean isRunning = true;

        while (isRunning) {
            int choice = DashboardView.showMenu();
            switch (choice) {
                case 1 -> operationsController.createAccount();
                case 2 -> operationsController.handleDeposit();
                case 5 -> operationsController.showTransactions();
                case 6 -> {
                    MessageView.showMessage("Thank you for using Bank Management System !!");
                    isRunning = false;
                }
                default -> MessageView.showMessage("Sorry, that is not a valid option !!");
            }
        }
    }
}

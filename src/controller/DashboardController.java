package controller;

import view.DashboardView;
import view.MessageView;

public class DashboardController {
    private final OperationsController operationsController;

    public DashboardController() {
        this.operationsController = new OperationsController();
    }

    public void start() {
        while (true) {
            int choice = DashboardView.showMenu();
            switch (choice) {
                case 1 -> operationsController.createAccount();
                case 2 -> operationsController.handleDeposit();
                case 3 -> operationsController.handleWithdraw();
                case 4 -> operationsController.handleTransfer();
                case 5 -> operationsController.showTransactions();
                case 6 -> {
                    exitApp();
                    return;
                }
            }
        }
    }

    private void exitApp() {
        MessageView.showMessage("Thank you for using the Bank Management System. Goodbye!");
    }
}

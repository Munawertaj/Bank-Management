package controller;

import view.DashboardView;

public class DashboardController {

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            int choice = DashboardView.showMenu();
        }
    }
}

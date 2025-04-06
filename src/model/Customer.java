package model;

public class Customer {
    private static int customerCounter = 0;
    private final int customerId;
    private final String name;

    public Customer(String name) {
        this.customerId = ++customerCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

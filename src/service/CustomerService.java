package service;

import model.Customer;

public class CustomerService {
    public Customer createCustomer(String name) {
        return new Customer(name);
    }
}

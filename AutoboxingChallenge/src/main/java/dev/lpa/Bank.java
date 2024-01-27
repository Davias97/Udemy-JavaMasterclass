package dev.lpa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String name) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", name);
        return null;
    }

    public void addCustomer(String name, double initialDeposit) {

        if (getCustomer(name) == null) {
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, Double amount) {

        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(amount);
        }
    }

    public void printInfo(String name) {
        Customer customer = getCustomer(name);
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transactions()) {
            System.out.printf("%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}

package dev.klt;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transitions) {
    public Customer(String name, Double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500)
        );
        transitions.add(initialDeposit);
    }
}

public class BankRecord {
    public static void main(String[] args) {
        Customer bob = new Customer("Bobs", 1000.00);
        System.out.println(bob);

        Bank bank = new Bank("KBZ");
        bank.addCustomer("Jane A", 200.00);
        System.out.println(bank);
        bank.addTransitions("Jane A", 200.00);
        bank.addTransitions("Jane A", -100.00);
        bank.printStatement("Jane a");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) not found %n", name);
        return null;
    }

    public void addCustomer(String customerName, double initialDeposit) {
        if (findCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customers.add(newCustomer);
            System.out.printf("Customer %s added %n", newCustomer.name());
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransitions(String name, double transitionAmt) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.transitions().add(transitionAmt);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer: " + customer.name());
        for (double transitionAmt : customer.transitions()) {
            System.out.printf("$%10.2f (%s)%n", transitionAmt, transitionAmt < 0 ? "debit" : "credit");
        }
        System.out.println("-".repeat(30));
        double total = 0;
        for (double transitionAmt : customer.transitions()) {
            total += transitionAmt;
        }
        System.out.println("Total Amount: " + total);

    }
}

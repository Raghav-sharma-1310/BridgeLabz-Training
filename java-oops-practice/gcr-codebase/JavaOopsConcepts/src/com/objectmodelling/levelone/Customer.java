package com.objectmodelling.levelone;

public class Customer {

    private String customerName;
    private double balance;
    private Bank bank;

    public Customer(String customerName, double balance, Bank bank) {
        this.customerName = customerName;
        this.balance = balance;
        this.bank = bank;
    }

    public void viewBalance() {
        System.out.println(customerName + "'s Balance: ₹" + balance
                + " (Bank: " + bank.getBankName() + ")");
    }

    public String getCustomerName() {
        return customerName;
    }
    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + customerName + " placed an order.");
        order.showOrderDetails();
    }
}

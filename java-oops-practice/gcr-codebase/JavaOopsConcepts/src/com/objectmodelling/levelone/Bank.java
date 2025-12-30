package com.objectmodelling.levelone;

public class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.getCustomerName()
                + " in " + bankName);
    }

    public String getBankName() {
        return bankName;
    }
}

package com.objectmodelling.levelone;

public class MainAssociation {

    public static void main(String[] args) {

        Bank sbiBank = new Bank("SBI Bank");

        Customer customer1 = new Customer("Rohan", 5000, sbiBank);
        Customer customer2 = new Customer("Aman", 8000, sbiBank);

        sbiBank.openAccount(customer1);
        sbiBank.openAccount(customer2);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}

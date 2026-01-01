package com.inheritance.hiererchicalinheritance.bankaccounttype;

public class BankMain {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA102", 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FD103", 100000, 5);

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}

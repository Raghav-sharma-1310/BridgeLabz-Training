package com.constructors.levelone;

public class SavingsAccount extends BankAccount {

    public  SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder    : " + accountHolder);
        System.out.println("Balance   : ₹" + getBalance());
    }
    
    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount("ACC101", "Raman", 25000);

        sa.displayDetails();
        sa.setBalance(30000);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}
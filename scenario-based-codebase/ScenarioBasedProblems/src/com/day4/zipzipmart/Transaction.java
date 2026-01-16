package com.day4.zipzipmart;

class Transaction {
    String id;
    String date;  
    double amount;

    Transaction(String id, String date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    void display() {
        System.out.println(id + " | " + date + " | " + amount);
    }
}

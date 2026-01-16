package com.day4.zipzipmart;

public class ZipZipMartMain {
    public static void main(String[] args) {

        Transaction[] transactions = {
            new Transaction("T101", "2025-01-15", 1500),
            new Transaction("T102", "2025-01-14", 700),
            new Transaction("T103", "2025-01-15", 700),
            new Transaction("T104", "2025-01-13", 2500),
            new Transaction("T105", "2025-01-15", 700)
        };

        ZipZipMartReport report = new ZipZipMartReport();

        report.mergeSort(transactions, 0, transactions.length - 1);

        System.out.println("===== Daily Sales Summary ======");
        report.printReport(transactions);
    }
}

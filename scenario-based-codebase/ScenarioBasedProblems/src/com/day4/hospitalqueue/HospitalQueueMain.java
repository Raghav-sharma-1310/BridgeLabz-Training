package com.day4.hospitalqueue;

public class HospitalQueueMain {
    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Ramesh", 1, 4),
            new Patient("Sita", 2, 9),
            new Patient("Arjun", 3, 6),
            new Patient("Meena", 4, 10),
            new Patient("Karan", 5, 3)
        };

        HospitalQueue queue = new HospitalQueue();

        System.out.println("Before Sorting:");
        queue.displayQueue(patients);

        queue.sortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        queue.displayQueue(patients);
    }
}

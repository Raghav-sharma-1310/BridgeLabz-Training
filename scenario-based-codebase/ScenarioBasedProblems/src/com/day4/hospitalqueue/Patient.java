package com.day4.hospitalqueue;

public class Patient {
    String name;
    int arrivalTime;
    int criticality; 

    Patient(String name, int arrivalTime, int criticality) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.criticality = criticality;
    }

    void display() {
        System.out.println(
            "Name: " + name +
            ", Arrival: " + arrivalTime +
            ", Criticality: " + criticality
        );
    }
}

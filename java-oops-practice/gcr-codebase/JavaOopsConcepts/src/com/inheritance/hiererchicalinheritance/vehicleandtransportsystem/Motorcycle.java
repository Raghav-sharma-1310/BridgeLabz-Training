package com.inheritance.hiererchicalinheritance.vehicleandtransportsystem;

public class Motorcycle extends Vehicle {

    Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");
    }
}

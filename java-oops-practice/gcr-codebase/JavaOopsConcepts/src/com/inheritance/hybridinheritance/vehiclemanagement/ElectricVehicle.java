package com.inheritance.hybridinheritance.vehiclemanagement;

public class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric vehicle is charging");
    }
}

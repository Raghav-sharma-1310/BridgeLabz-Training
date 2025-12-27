package com.constructors.levelone;

class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee = 1500;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ram", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(2000);
        v2.displayVehicleDetails();
    }
}

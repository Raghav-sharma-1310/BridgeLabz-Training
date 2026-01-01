package com.inheritance.hybridinheritance.vehiclemanagement;

public class VehicleMain {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.charge();
        pv.refuel();
    }
}

package com.cabbygo;

public class Vehicle {
    String name;
	protected String vehicleNumber ;
	
	Vehicle(String vehicleNumber, String name){
		this.vehicleNumber = vehicleNumber;
		this.name = name;
	}
	
	public void calculateFare(User user) {
		System.out.println("The total fare is");
	}
	
	
}

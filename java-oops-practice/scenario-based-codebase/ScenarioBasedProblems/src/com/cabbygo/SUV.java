package com.cabbygo;

public class SUV extends Vehicle{
	protected int capacity;
	protected double baseFare;
	private double rate;
	
    SUV(String vehicleNumber, int capacity, double baseFare, double rate){
    	super(vehicleNumber, "SUV");
    	this.capacity = capacity;
    	this.baseFare = baseFare;
    	this.rate = rate;
    }
    
    public void calculateFare(User user) {
    	double fare = baseFare + (user.distance)* rate;
    	System.out.println("The total Fare of the journey : " + fare);
    }

}

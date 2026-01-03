package com.cabbygo;

public class Sedan extends Vehicle{
	protected int capacity;
	protected double baseFare;
	private double rate;
	
    Sedan(String vehicleNumber,int capacity, double baseFare, double rate){
    	super(vehicleNumber, "Sedan");
    	this.capacity = capacity;
    	this.baseFare = baseFare;
    	this.rate = rate;
    }
    
    public void calculateFare(User user) {
    	double fare = baseFare + (user.distance)* rate;
    	System.out.println("The total Fare of the journey : " + fare);
    }

}

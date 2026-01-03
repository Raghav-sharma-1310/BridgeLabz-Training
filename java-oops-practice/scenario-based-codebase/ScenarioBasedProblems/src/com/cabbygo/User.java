package com.cabbygo;

public class User implements IRideService{

	private String name;
	private String location;
    double distance;
	
	User(String name, String location, double distance){
		this.name = name;
		this.location = location;
		this.distance = distance;
	}
	
	@Override
	public void bookRide(Driver d1) {
		System.out.println("Your Ride is confimed");
		System.out.println("The Driver of your Ride is " + d1.name );
	}
	
	@Override
	public void endRide() {
		System.out.println("You Arrived your entered location");
	}
}

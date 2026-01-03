package com.cabbygo;

public class Driver {
	
    String name;
	protected String licenceNumber;
	private int rating;
	
	Driver(String name, String licenceNumber, int rating){
		this.name = name;
		this.licenceNumber = licenceNumber;
		this.rating = rating;
	}

	public void assigneVehicle(Vehicle m1) {
		System.out.println(name + " is with vehicle type " + m1.name);
	}
}

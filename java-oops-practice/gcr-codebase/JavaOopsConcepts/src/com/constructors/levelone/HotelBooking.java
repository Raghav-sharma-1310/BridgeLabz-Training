package com.constructors.levelone;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    // Default constructor
    public HotelBooking() {
    	guestName = "Ram";
    	roomType = "single";
    	nights = 4;
    }
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
    	this.guestName = guestName;
    	this.roomType = roomType;
    	this.nights = nights;
    }
    // Copy constructor
    public HotelBooking( HotelBooking previousBooking) {
    	this.guestName = previousBooking.guestName;
    	this.roomType = previousBooking.roomType;
    	this.nights = previousBooking.nights;
    }
    // Displaying the guest details
    public void displayHotelBooking() {
    	System.out.println("Guest Name : " + guestName);
    	System.out.println("Room Type : " + roomType);
    	System.out.println("Number of nights : " + nights);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelBooking hotelBook = new HotelBooking();
		System.out.println("---The Details of the Guest in Hotel---");
		hotelBook.displayHotelBooking();
		System.out.println();
		HotelBooking hotelBook1 = new HotelBooking("Raman", "double", 2);
		System.out.println("---The Details of the Guest in Hotel---");
		hotelBook1.displayHotelBooking();
		System.out.println();
		HotelBooking hotelBook2 = new HotelBooking(hotelBook1);
		System.out.println("---The Details of the Guest in Hotel---");
		hotelBook2.displayHotelBooking();	
	}

}

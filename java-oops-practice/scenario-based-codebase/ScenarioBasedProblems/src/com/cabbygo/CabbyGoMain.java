package com.cabbygo;
import java.util.Scanner;
public class CabbyGoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n================================== Welcome to Cabby Go =====================================\n");
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the location where you want to go : ");
		String location = sc.nextLine();
		User user = new User("Ram", location, 25);
		Driver d1= new Driver("Rajendra", "LIC-4561236", 4);
		
		System.out.println("Enter the type of vehicle (mini, suv, sedan) : ");
		String type = sc.next();
		Vehicle m1 = null;
		switch(type) {
		   case "mini":
			    m1 = new Mini("GN-45685", 4, 200, 20);
			   break;
		   case "suv":
			    m1 = new SUV("HR-54684", 5, 380, 50);
			   break;
		   case "sedan":
			   m1 = new Sedan("RJ-54684", 4, 280, 35);
			   break;
		}
		user.bookRide(d1);
		d1.assigneVehicle(m1);
		
		System.out.println("-----------------------------------------------------------------------------------------");
		user.endRide();
		m1.calculateFare(user);
		
		System.out.println("\n================================= Thank you =============================================\n");
	}

}

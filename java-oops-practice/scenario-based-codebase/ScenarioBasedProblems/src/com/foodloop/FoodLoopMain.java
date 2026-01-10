package com.foodloop;

public class FoodLoopMain {

	public static void main(String[] args) {
		System.out.println("========== Welcome to FoodLoop ===========\n");
		User user1 = new User("Prateek");
		FoodItem chana = new VegItem("Chana Masala", 75.0, 2);
		FoodItem paalak = new VegItem("Paalak Paneer", 115.0, 2);
		FoodItem chicken = new NonVegItem("Chicken", 450.0, 2);
		FoodItem Fish = new NonVegItem("Fish Masala", 125.0,2);
	    Order o1 = new Order(user1);
	    o1.placeOrder(Fish);
	    o1.placeOrder(chana);
	    o1.placeOrder(paalak);
	    o1.placeOrder(chicken);
	    o1.placeOrder(chicken, Fish);
	    
	    o1.calculateBill();
	    System.out.println();
	    System.out.println("\n========== Thank You for Visiting FoodLoop ===========\n");
	}

}

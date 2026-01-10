package com.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable{
	double totalAmount;
	List <FoodItem> foodItem;
	User user;
	Order(User user){
		System.out.println("Please add food Items .....");
		foodItem = new ArrayList<>();
		this.user =user;
	}
    
	@Override
	public void placeOrder(FoodItem foodItem1) {
		if(foodItem1.isAvailable()) {
			System.out.println("The order is placed for :" + foodItem1.name);
			foodItem.add(foodItem1);
			foodItem1.reduceStock();
		}
		else {
			System.out.println(foodItem1.name + " is out of stock at this moment");
		}
	}
	@Override
	public void placeOrder(FoodItem foodItem1, FoodItem foodItem2) {
		if(foodItem1.isAvailable() && foodItem2.isAvailable()) {
			System.out.println("The order is placed for combo :" + foodItem1.name +", " +foodItem2.name);
			foodItem.add(foodItem1);
			foodItem.add(foodItem2);
			foodItem1.reduceStock();
			foodItem1.reduceStock();
		}
		else {
			System.out.println(foodItem1.name + " is out of stock at this moment");
		}
	}

	@Override
	public void cancelOrder() {
		foodItem.clear();
		totalAmount = 0.0;
		System.out.println("Order Cancelled ...");
	}
	
	public void calculateBill() {
		totalAmount = 0.0;
		System.out.println("--------------Bill--------------");
		for(FoodItem order : foodItem) {
			System.out.printf("%-20s %.2f\n" , order.name, order.price);
			if(order instanceof VegItem) {
				totalAmount += order.price *0.9; // 10% off in veg items 
			}
			else {
				totalAmount += order.price *0.95; //5% off in Non veg Item 
			}
			  
		}
		System.out.println("-------------------------------------------");
		System.out.printf("%-20s %.2f", "The Total Amount after Discount : ", totalAmount);
	}
    
	
}

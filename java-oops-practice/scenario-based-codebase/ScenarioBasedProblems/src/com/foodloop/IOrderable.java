package com.foodloop;

public interface IOrderable {
	public void placeOrder(FoodItem foodItem1);
	public void placeOrder(FoodItem foodItem1, FoodItem foodItem2);
	public void cancelOrder();

}

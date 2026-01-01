package com.inheritance.hybridinheritance.restaurantmanagement;

public class RestaurantMain {
    public static void main(String[] args) {

        Worker chef = new Chef("Amit", 1);
        Worker waiter = new Waiter("Rohit", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}

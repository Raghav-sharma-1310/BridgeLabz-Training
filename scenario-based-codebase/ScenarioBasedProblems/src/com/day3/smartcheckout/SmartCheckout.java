package com.day3.smartcheckout;

import java.util.*;

public class SmartCheckout {
	private Map<String, Product> inventory =new HashMap<>();
	private Queue<String> customer =new LinkedList<>();
	
	public void addCustomer(String name) {
		customer.add(name);
		System.out.println("Customer with name " + name + " is joined");
	}
	
	public String serveNextCustomer() {
		return customer.poll();
	}
	
	public void processPurchase(String itemName, int quantity) {
		if(inventory.containsKey(itemName)) {
			Product p =inventory.get(itemName);
			if(p.stock >= quantity) {
				double total = p.price * quantity;
				p.stock -=quantity;
				System.out.println("Item : " + itemName + " | Total : " + total);
				System.out.println("Remaining stock : " +p.stock);
			}
			else {
				System.out.println("Insufficient stock for " + itemName);
			}
		}
		else{
			System.out.println("Item is not Found in an Inventory");
		}
	}
	
	public static void main(String[] args) {
		SmartCheckout checkout =new SmartCheckout();
		
		checkout.inventory.put("Milk", new Product(65.5, 10));
        checkout.inventory.put("Bread", new Product(22.5, 3));
        checkout.inventory.put("Butter", new Product(50,5));
        
        checkout.addCustomer("Alice");
        checkout.addCustomer("Bob");
        checkout.addCustomer("Rajeev");
        
        String current = checkout.serveNextCustomer();
        System.out.println("\nProcessing : " + current);
        checkout.processPurchase("Milk", 2);
        System.out.println("\n----Next-----");
        String current1 = checkout.serveNextCustomer();
        System.out.println("\nProcessing : " + current1);
        checkout.processPurchase("Bread", 2);
        System.out.println("\n----Next-----");
        String current2 = checkout.serveNextCustomer();
        System.out.println("\nProcessing : " + current2);
        checkout.processPurchase("Butter", 2);
        System.out.println("\n----Next-----");
        String current3 = checkout.serveNextCustomer();
        System.out.println("\nProcessing : " + current3);
	}
}

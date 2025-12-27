package com.constructors.levelone;

public class Product {
    // Instance Variable
	String productName;
	double price; 
	// Class Variable totalProducts
	static int totalProducts = 0;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	// Displaying the product name and price
	public void dsplayProductDetails() {
		System.out.println("The name of product : " + productName);
		System.out.println("The price of product : " + price);
	}
	// Displaying the total number of products
	public void displayingTotalProducts() {
		System.out.println("The total number of product : " + totalProducts);
	}
	public static void main(String[] args) {
		 Product p1 = new Product("Laptop", 55000);
	     Product p2 = new Product("Mobile", 25000);
	     Product p3 = new Product("Headphones", 3000);

	     p1.dsplayProductDetails();
	     System.out.println();

	     p2.dsplayProductDetails();
	     System.out.println();

	     p3.dsplayProductDetails();
	     System.out.println();

	     // Calling class method using class name
	     p3.displayingTotalProducts();
	}

}

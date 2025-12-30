package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        double total = 0;

        for (Product product : products) {
            System.out.println("- " + product.getProductName()
                    + " : ₹" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}

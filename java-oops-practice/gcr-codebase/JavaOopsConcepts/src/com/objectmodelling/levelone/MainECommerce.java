package com.objectmodelling.levelone;

public class MainECommerce {

    public static void main(String[] args) {

        Customer customer = new Customer("Ram");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        Order order = new Order(101);
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        customer.placeOrder(order);
    }
}

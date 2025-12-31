package com.inheritance.multilevelinheritance.onlineretailorder;

public class OrderManagement {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "10-Jan-2025",
                "TRK12345",
                "15-Jan-2025"
        );

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Status: " + order.getOrderStatus());
    }
}
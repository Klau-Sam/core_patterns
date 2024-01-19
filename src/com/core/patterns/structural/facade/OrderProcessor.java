package com.core.patterns.structural.facade;

public class OrderProcessor {

    public boolean checkStock(String name) {
        System.out.println("Checking stock");
        return true;
    }

    public String placeOrder(String name, int quantity) {
        System.out.println("Order placed");
        return "1A";
    }

    public void shipOrder(String orderId) {
        System.out.println("Order with id " + orderId + " shipped");
    }
}

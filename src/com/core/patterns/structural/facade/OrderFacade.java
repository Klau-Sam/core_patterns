package com.core.patterns.structural.facade;

public class OrderFacade {

    private OrderProcessor orderProcessor = new OrderProcessor();

    public void processOrder(String productName, int quantity) {
        if (orderProcessor.checkStock(productName)) {
            String orderId = orderProcessor.placeOrder(productName, quantity);
            orderProcessor.shipOrder(orderId);
        };
    }
}

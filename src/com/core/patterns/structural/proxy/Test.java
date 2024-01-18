package com.core.patterns.structural.proxy;

public class Test {

    public static void main(String[] args) { // hibernate uses virtual proxy for lazy loading using reflection
        Customer customer = new CustomerProxyImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders().size());
    }
}

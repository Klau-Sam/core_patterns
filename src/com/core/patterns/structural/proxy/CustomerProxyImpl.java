package com.core.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

    CustomerImpl customer = new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    public void setId(int id) {
        customer.setId(id);
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();

        Order order1 = new Order();
        order1.setId(1);
        order1.setProductName("AirPods");
        order1.setQuantity(10);
        orders.add(order1);

        Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("iPhone");
        order2.setQuantity(20);
        orders.add(order2);

        return orders;
    }

    public void setOrders(List<Order> orders) {
        customer.setOrders(orders);
    }
}

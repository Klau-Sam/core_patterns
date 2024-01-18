package com.core.patterns.creational.factory.pizza;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza p = null;
        if (type.equals("Cheese")) {
            p = new CheesePizza();
        } else if (type.equals("Meat")) {
            p = new MeatPizza();
        }

        return p;
    }
}

package com.core.patterns.structural.decorator;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new MeatPizzaDecorator(new CheesePizzaDecorator(new BasePizza()));
        pizza.bake();
    }
}

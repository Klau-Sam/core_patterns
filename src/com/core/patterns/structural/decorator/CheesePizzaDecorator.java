package com.core.patterns.structural.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        addCheese();
    }

    private void addCheese() {
        System.out.println("Adding cheese");
    }
}

package com.core.patterns.structural.decorator;

public class MeatPizzaDecorator extends PizzaDecorator {
    public MeatPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        addMeatToppings();
    }

    private void addMeatToppings() {
        System.out.println("Adding meat toppings");
    }
}

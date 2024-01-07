package com.core.patterns.decorator;

public class BasePizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking base pizza");
    }
}

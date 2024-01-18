package com.core.patterns.creational.factory;

import com.core.patterns.creational.factory.person.Person;
import com.core.patterns.creational.factory.person.PersonFactory;
import com.core.patterns.creational.factory.pizza.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        ps.orderPizza("Meat");
        ps.orderPizza("Cheese");

        Person p = PersonFactory.create("male");
        p.wish("get a beer");
    }
}

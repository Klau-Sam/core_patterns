package com.core.patterns.factory;

import com.core.patterns.factory.person.Person;
import com.core.patterns.factory.person.PersonFactory;
import com.core.patterns.factory.pizza.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        ps.orderPizza("Meat");
        ps.orderPizza("Cheese");

        Person p = PersonFactory.create("male");
        p.wish("get a beer");
    }
}

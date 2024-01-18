package com.core.patterns.creational.factory.person;

public class Male implements Person {
    @Override
    public void wish(String desire) {
        System.out.printf("Male's wish: %s", desire);
    }
}

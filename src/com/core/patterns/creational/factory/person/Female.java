package com.core.patterns.creational.factory.person;

public class Female implements Person {
    @Override
    public void wish(String desire) {
        System.out.printf("Women's wish: %s", desire);
    }
}

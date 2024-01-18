package com.core.patterns.creational.singleton;

public class TestEnum {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Michael");
        System.out.println(instance.getName());
    }
}

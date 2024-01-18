package com.core.patterns.creational.singleton;

public enum EnumSingleton { // fixes the reflection problem
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

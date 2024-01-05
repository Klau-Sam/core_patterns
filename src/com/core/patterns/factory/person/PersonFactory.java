package com.core.patterns.factory.person;

public class PersonFactory {
    public static Person create(String gender) {
        Person p = null;

        if (gender.equals("female")) {
            p = new Female();
        } else if (gender.equals("male")) {
            p = new Male();
        }

        return p;
    }
}

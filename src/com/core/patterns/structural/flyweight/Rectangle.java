package com.core.patterns.structural.flyweight;

public class Rectangle extends Shape {

    private String label;

    Rectangle() {
        label = "rectangle";
    }
    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " with length " + length + " and breadth " + breadth + ", fill style " + fillStyle);
    }
}

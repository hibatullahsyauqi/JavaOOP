package com.enigma.gosling7.abstraction;

public abstract class Shape {
    // this is an abstract class
    // it does construction too
    // it can make ordinary methods

    public abstract Double getArea();
    public abstract Double getPerimeter();

    public void detail() {
        System.out.println("Shape");
    }

    public Shape() {

    }
}
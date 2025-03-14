package com.enigma.gosling7.abstraction;

public class Circle extends Shape {
    private Double radius;
    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + Math.PI +
                '}';
    }
}

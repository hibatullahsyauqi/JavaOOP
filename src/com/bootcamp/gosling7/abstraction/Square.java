package com.bootcamp.gosling7.abstraction;

public class Square extends Shape {
    private Double side;
    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public Double getPerimeter() {
        return side * 4;
    }

    @Override
    public void detail() {
        System.out.println("Square Details");
    }
}

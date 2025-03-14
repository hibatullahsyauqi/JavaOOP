package com.enigma.gosling7.inheritance;

public class Block extends Rectangle {
    private double height;
    public Block(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * (this.getLength() * this.getWidth()) +
                2 * (this.getLength() * this.height) +
                2 * (this.getWidth() * this.height);
    }

    public double getVolume() {
        return this.getLength() * this.getWidth() * this.height;
    }
}

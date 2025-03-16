package com.bootcamp.gosling7.example_enum;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    // method untuk belok kanan kiri
    public Direction turnRight() {
        return values()[this.ordinal() + 1];
    }

    public Direction turnLeft() {
        return values()[this.ordinal() - 1];
    }
}

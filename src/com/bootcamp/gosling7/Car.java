package com.bootcamp.gosling7;

public class Car {
    // attributes
    String carName; // if final couldn't be changed later
    String brand;
    boolean isElectric;

    // non-static methods (through object)
    public void move() {
        System.out.println("Car is moving...");
        stop();
    }

    // static method (through class)
    public static void stop() {
        System.out.println("Car is stopping...");
    }

    // constructor -> method that is being made firstly in default (w/o parameters) when making an object instance
    public Car(String carName, String brand, boolean isElectric) {
        this.brand = brand;
        this.carName = carName;
        this.isElectric = isElectric;
    }

    // empty constructor
    public Car() {

    }

}

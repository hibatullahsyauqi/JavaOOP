package com.enigma.gosling7;

public class CarApp {
    public static void main(String[] args) {
        Car honda = new Car("Jazz", "Honda", false); // declare a new object instance from Car class
        Car volvo = new Car();
        Car toyota = new Car();

        honda.carName = "Jazz";
        honda.brand = "Honda";
        // honda.isElectric = false; // will follow the default if omitted

        // these all will output objects' addresses
        System.out.println(honda);
        System.out.println(volvo);
        System.out.println(toyota);

        System.out.println("Brand: " + honda.brand);
        System.out.println("Name: " + honda.carName);
        System.out.println("IsElectric: " + honda.isElectric);
        honda.move();
        Car.stop();

        System.out.println(volvo.carName); // outputs null or if declared default would output default

    }
}

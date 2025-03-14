package com.bootcamp.gosling7.inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        /**
         * Inheritance
         * 1. Derivation from parent class to child -> attribute/method
         * 2. Child class has everything that its parent class has
         *
         * Concepts
         * 1. Override
         * 2. Extend
         */

//        Cat persia = new Cat();
//        Cow sapigo = new Cow();
//        persia.sound();
//        persia.eat();
//        sapigo.sound();
//        sapigo.eat();

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Block block = new Block(5,6,7);
        System.out.println(block.getArea());
        System.out.println(block.getVolume());
    }
}

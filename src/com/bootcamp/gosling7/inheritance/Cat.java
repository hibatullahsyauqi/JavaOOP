package com.bootcamp.gosling7.inheritance;

public class Cat extends Mammals {
    @Override
    public void sound() {
        System.out.println("Cat sounds...");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats...");
    }
}

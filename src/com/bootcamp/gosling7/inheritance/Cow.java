package com.bootcamp.gosling7.inheritance;

public class Cow extends Mammals {
    @Override
    public void sound() {
        System.out.println("Cow sounds...");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats...");
    }
}

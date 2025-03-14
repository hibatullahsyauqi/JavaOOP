package com.bootcamp.gosling7.encapsulation;

public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public Person() {}

    public void sayHello() {
        System.out.println("Hello my name is " + this.name);
    }

    // setter getter
    // setter -> setting value
    // set(attributeName)

    public void setName(String name) {
        if (name.length() < 3) {
            System.out.println("Name must be at least 3 characters");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }
}

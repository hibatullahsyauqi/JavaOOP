package com.bootcamp.gosling7.encapsulation;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Adib", 22, "Membaca");
        Person person2 = new Person();

//        System.out.println(person1.name);
//        // re-assign
//        person1.name = "Oki";
//        System.out.println(person1.age);
//        System.out.println(person1.hobby);

        person1.sayHello();
        person1.setName("Fahmi");
        person1.sayHello();
        System.out.println(person1.getName());
    }
}

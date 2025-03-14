package com.bootcamp.objectinteraction;

public class MobileLegends {
    public static void main(String[] args) {
        Hero layla = new Hero("Layla", 1000, 500);
        Monster lord = new Monster("Monster", 10000, 100);

        System.out.println("Lord HP: " + lord.getHp());
        System.out.println("Layla HP: " + layla.getHp());
        layla.attack(lord);
        System.out.println("Lord HP: " + lord.getHp());
        System.out.println("Layla HP: " + layla.getHp());
        lord.attack(layla);
        System.out.println("Lord HP: " + lord.getHp());
        System.out.println("Layla HP: " + layla.getHp());
    }
}

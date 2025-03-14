package com.bootcamp.mbg;

public class Vegetables extends FreeLunchMenu {
    private boolean isFruit;

    public Vegetables(String name, int calories, boolean isFruit) {
        super(name, calories);
        this.isFruit = isFruit;
    }

    public boolean isFruit() {
        return isFruit;
    }

    public void setFruit(boolean fruit) {
        this.isFruit = fruit;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[%d] %s - %d kcal (Tipe: %s)\n", getId(), getName(), getCalories(), isFruit() ? "Buah-buahan" : "Sayur-mayur");
    }
}

package com.enigma.mbg;

class Dishes extends FreeLunchMenu {
    private boolean isVegetarian;

    public Dishes(String name, int calories, boolean isVegetarian) {
        super(name, calories);
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[%d] %s - %d kcal (Untuk vegetarian: %s)\n", getId(), getName(), getCalories(), (isVegetarian ? "Ya" : "Tidak"));
    }
}

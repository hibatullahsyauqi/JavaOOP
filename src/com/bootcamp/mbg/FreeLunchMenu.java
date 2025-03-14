package com.bootcamp.mbg;

public abstract class FreeLunchMenu {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int calories;

    public FreeLunchMenu(String name, int calories) {
        this.id = idCounter++;
        this.name = name;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public abstract void displayInfo();

    public void setId(int id) {
        this.id = id;
    }
}

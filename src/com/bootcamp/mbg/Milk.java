package com.bootcamp.mbg;

class Milk extends FreeLunchMenu {
    private String milkType;

    public Milk(String name, int calories, String milkType) {
        super(name, calories);
        this.milkType = milkType;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[%d] %s - %d kcal (Jenis susu: %s)\n", getId(), getName(), getCalories(), milkType);
    }
}

package com.bootcamp.mbg;

class Staple extends FreeLunchMenu {
    private String source;

    public Staple(String name, int calories, String source) {
        super(name, calories);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[%d] %s - %d kcal (Sumber: %s)\n", getId(), getName(), getCalories(), getSource());
    }
}

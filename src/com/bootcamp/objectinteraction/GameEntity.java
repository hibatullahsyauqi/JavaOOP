package com.bootcamp.objectinteraction;

public abstract class GameEntity {
    private String name;
    private Integer hp;
    private Integer damage;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    // attack method
    public void attack(GameEntity target) {
        target.getAttacked(this.damage);
    }

    // getAttacked method
    public void getAttacked(Integer damage) {
        this.hp -= damage;
    }
}
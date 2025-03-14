package com.bootcamp.objectinteraction;

public class Monster extends GameEntity {
    public Monster(String name, Integer hp, Integer damage) {
        this.setName(name);
        this.setHp(hp);
        this.setDamage(damage);
    }
}
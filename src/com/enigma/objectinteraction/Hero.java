package com.enigma.objectinteraction;

public class Hero extends GameEntity {
    public Hero(String name, Integer hp, Integer damage) {
        this.setName(name);
        this.setHp(hp);
        this.setDamage(damage);
    }
}
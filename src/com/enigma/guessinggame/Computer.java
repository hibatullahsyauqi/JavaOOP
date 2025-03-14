package com.enigma.guessinggame;

import java.util.Random;

public class Computer extends GameEntity {
    private int targetedNumber;

    public Computer() {
        Random random = new Random();
        targetedNumber = random.nextInt(10) + 1;
        setName("Computer");
    }

    public boolean checkGuess(int guess) {
        return guess == targetedNumber;
    }
}

package com.bootcamp.guessinggame;

import java.util.Scanner;

public class Player extends GameEntity {
    private int guess;
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
        askForName();
    }

    private void askForName() {
        System.out.print("Please enter your name: ");
        setName(scanner.nextLine());
    }

    public void makeGuess() {
        System.out.println(getName() + ", enter your guess (1-10): ");
        while (true) {
            try {
                guess = Integer.parseInt(scanner.nextLine());
                if (guess >= 1 && guess <= 10) {
                    break;
                } else {
                    System.out.println("Your guess is not between 1 and 10");
                }
            } catch (NumberFormatException e) {
                System.out.println("Your guess is not between 1 and 10");
            }
        }
    }

    public int getGuess() {
        return guess;
    }
}

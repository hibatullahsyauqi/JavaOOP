package com.bootcamp.gosling7.encapsulation;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return "Your balance is " + balance;
    }

    // withdraw
    public void withdraw(int amount) {
        // check whether the balance is enough to be withdrawn
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    // deposit
    public void deposit(int amount) {
        // minimum of deposit is 10000
        if (amount < 10000) {
            System.out.println("Minimum of deposit amount is 10000");
        } else {
            this.balance += amount;
        }
    }
}

package com.bootcamp.gosling7.encapsulation;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bca = new BankAccount(50000);
        BankAccount mandiri = new BankAccount(50000);
        System.out.println(bca.getBalance());

        // deposit
        bca.deposit(150000);
        System.out.println(bca.getBalance());

        // withdraw
        bca.withdraw(20000);
        System.out.println(bca.getBalance());
    }
}

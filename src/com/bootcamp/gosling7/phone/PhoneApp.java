package com.bootcamp.gosling7.phone;

import java.util.Scanner;
import com.bootcamp.gosling7.phone.impl.PhoneImpl;

public class PhoneApp {
    public static void main(String[] args) {
        PhoneImpl phone = new PhoneImpl();
        UserPhone oki = new UserPhone("Oki", "iPhone", 76, phone);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=".repeat(20));
            System.out.println("1. Power on");
            System.out.println("2. Power off");
            System.out.println("3. Volume up");
            System.out.println("4. Volume down");
            System.out.println("5. Charge the phone");
            System.out.println("6. Show Battery");
            System.out.println("7. Use the phone");
            System.out.println("8. Exit");
            System.out.println("=".repeat(20));
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    oki.turnOn();
                    break;
                case 2:
                    oki.turnOff();
                    break;
                case 3:
                    System.out.println("Enter volume: ");
                    int incVol = scanner.nextInt();
                    scanner.nextLine();
                    oki.increaseVolume(incVol);
                    break;
                case 4:
                    System.out.println("Enter volume: ");
                    int decVol = scanner.nextInt();
                    scanner.nextLine();
                    oki.decreaseVolume(decVol);
                    break;
                case 5:
                    oki.charging();
                    break;
                case 6:
                    oki.showBattery();
                    break;
                case 7:
                    oki.using();
                    break;
                case 8:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

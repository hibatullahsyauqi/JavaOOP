package com.bootcamp.robotchallenge;

import java.util.Scanner;

public class RobotSimulation {
    public static void main(String[] args) {
        Robot robot = Robot.loadLastPosition();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan perintah (A = maju, L = kiri, R = kanan, Q = keluar");
        while (true) {
            String command = scanner.next().toUpperCase();
            if (command.equals("Q")) break;
            switch (command) {
                case "A" -> robot.moveForward();
                case "L" -> robot.turnLeft();
                case "R" -> robot.turnRight();
                default -> System.out.println("Perintah tak dikenali.");
            }
        }

        robot.saveFinalPosition();
        System.out.println("Simulasi selesai. Cek file.txt untuk log perjalanan.");
    }
}

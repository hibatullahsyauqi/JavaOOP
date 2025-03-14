package com.enigma.gosling7.example_static;

import java.util.Scanner;

public class InputUtil {

    public static Scanner scanner = new Scanner(System.in);

    public static String inputString(String text) { // input nama
        System.out.printf("%s: ", text);
        return scanner.nextLine();
    }

    public static int inputInt(String text) {
        System.out.printf("%s: ", text);
        return Integer.parseInt(scanner.nextLine());
    }
}

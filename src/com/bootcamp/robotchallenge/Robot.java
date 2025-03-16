package com.bootcamp.robotchallenge;

import java.io.*;

public class Robot {
    private Direction direction;
    private int x, y;
    private static final String FILE_NAME = "file.txt";

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void moveForward() {
        switch(direction) {
            case NORTH -> y++;
            case EAST -> x++;
            case SOUTH -> y--;
            case WEST -> x--;
        }
        logMovement("A");
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        logMovement("L");
    }

    public void turnRight() {
        direction = direction.turnRight();
        logMovement("R");
    }

    private void logMovement(String command) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(command + " -> {" + direction + ", " + x + ", " + y + "}\n");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam menulis file.");
        }
    }

    public void saveFinalPosition() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write("\nPosisi akhir: " + direction + ", " + x + ", " + y + "\n");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan posisi akhir.");
        }
    }

    public static Robot loadLastPosition() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("File tidak ditemukan, menggunakan posisi default.");
            return new Robot(Direction.EAST, 2, 3);
        }

        String lastLine = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("{")) {
                    lastLine = line;
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
        }

        if (lastLine != null) {
            try {
                String[] parts = lastLine.split("\\{|, |}");
                Direction direction = Direction.valueOf(parts[1]);
                int x = Integer.parseInt(parts[2]);
                int y = Integer.parseInt(parts[3]);
                return new Robot(direction, x, y);
            } catch (Exception e) {
                System.out.println("Format file salah, menggunakan posisi default.");
            }
        }
        return new Robot(Direction.EAST, 2, 3);
    }
}

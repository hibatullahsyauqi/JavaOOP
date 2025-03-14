package com.bootcamp.mbg;

import com.bootcamp.mbg.impl.MenuServiceImpl;

import java.util.Scanner;

public class FreeLunchManagement {
    public static void main(String[] args) {
        MenuService menuService = new MenuServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Menu Makan Siang Gratis ====");
            System.out.println();
            System.out.println("1. Tambahkan Menu");
            System.out.println("2. Tinjau Menu");
            System.out.println("3. Perbarui Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar Menu");
            System.out.print("\nPilih sebuah opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("==== Menu Makan Siang Gratis ====");
                    System.out.println();
                    System.out.println("Tipe hidangan:");
                    System.out.println("1. Pokok");
                    System.out.println("2. Lauk");
                    System.out.println("3. Sayur-mayur / Buah-buahan");
                    System.out.println("4. Susu");
                    System.out.print("Pilih tipe hidangan: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan kalori dalam kkal: ");
                    int calories = scanner.nextInt();
                    scanner.nextLine();
                    switch (type) {
                        case 1:
                            System.out.print("Masukkan sumber makanan pokok (beras, gandum, jagung): ");
                            String source = scanner.nextLine();
                            Staple staple = new Staple(name, calories, source);
                            menuService.addMenu(staple);
                            break;
                        case 2:
                            Dishes dishes = new Dishes(name, calories, false);
                            System.out.print("Apakah aman untuk diet vegetarian? [ya(y)/tidak(t)]: ");
                            String vegetarian = scanner.nextLine().trim().toLowerCase();
                            if (vegetarian.equals("y") || vegetarian.equals("ya")) {
                                dishes.setVegetarian(true);
                            } else if (vegetarian.equals("t") || vegetarian.equals("tidak")) {
                                dishes.setVegetarian(false);
                            } else {
                                System.out.println("Input tidak valid! Harap masukkan 'ya' atau 'tidak'.");
                                return;
                            }
                            menuService.addMenu(dishes);
                            break;
                        case 3:
                            Vegetables vegetables = new Vegetables(name, calories, false);
                            System.out.print("Apakah berupa buah-buahan? [ya(y)/tidak(t)]: ");
                            String fruit = scanner.nextLine().trim().toLowerCase();
                            if (fruit.equals("y") || fruit.equals("ya")) {
                                vegetables.setFruit(true);
                            } else if (fruit.equals("t") || fruit.equals("tidak")) {
                                vegetables.setFruit(false);
                            } else {
                                System.out.println("Input tidak valid! Harap masukkan 'ya' atau 'tidak'.");
                                return;
                            }
                            menuService.addMenu(vegetables);
                            break;
                        case 4:
                            System.out.print("Masukkan tipe susu: ");
                            String milkType = scanner.nextLine();
                            Milk milk = new Milk(name, calories, milkType);
                            menuService.addMenu(milk);
                            break;
                        default:
                            System.out.println("Masukkan pilihan yang tepat!");
                    }
                    break;
                case 2:
                    menuService.displayMenu();
                    break;
                case 3:
                    System.out.println("==== Menu Makan Siang Gratis ====");
                    System.out.println();
                    System.out.print("Masukkan ID menu yang akan diperbarui: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tipe hidangan:");
                    System.out.println("1. Pokok");
                    System.out.println("2. Lauk");
                    System.out.println("3. Sayur-mayur / Buah-buahan");
                    System.out.println("4. Susu");
                    System.out.print("Pilih tipe hidangan baru: ");
                    int updateType = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama hidangan baru: ");
                    String newName = scanner.nextLine();
                    System.out.print("Masukkan kalori dalam kkal: ");
                    int newCalories = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    FreeLunchMenu updatedMenu = null;
                    switch (updateType) {
                        case 1:
                            System.out.print("Masukkan sumber makanan pokok (beras, gandum, jagung): ");
                            String newSource = scanner.nextLine();
                            updatedMenu = new Staple(newName, newCalories, newSource);
                            break;
                        case 2:
                            Dishes newDishes = new Dishes(newName, newCalories, false);
                            System.out.print("Apakah aman untuk diet vegetarian? [ya(y)/tidak(t)]: ");
                            String vegetarian = scanner.nextLine().trim().toLowerCase();
                            if (vegetarian.equals("y") || vegetarian.equals("ya")) {
                                newDishes.setVegetarian(true);
                            } else if (vegetarian.equals("t") || vegetarian.equals("tidak")) {
                                newDishes.setVegetarian(false);
                            } else {
                                System.out.println("Input tidak valid! Harap masukkan 'ya' atau 'tidak'.");
                                return;
                            }
                            updatedMenu = newDishes;
                            break;

                        case 3:
                            Vegetables newVegetables = new Vegetables(newName, newCalories, false);
                            System.out.print("Apakah berupa buah-buahan? [ya(y)/tidak(t)]: ");
                            String fruit = scanner.nextLine().trim().toLowerCase();
                            if (fruit.equals("y") || fruit.equals("ya")) {
                                newVegetables.setFruit(true);
                            } else if (fruit.equals("t") || fruit.equals("tidak")) {
                                newVegetables.setFruit(false);
                            } else {
                                System.out.println("Input tidak valid! Harap masukkan 'ya' atau 'tidak'.");
                                return;
                            }
                            updatedMenu = newVegetables;
                            break;
                        case 4:
                            System.out.print("Masukkan tipe susu: ");
                            String newMilkType = scanner.nextLine();
                            updatedMenu = new Milk(newName, newCalories, newMilkType);
                            break;
                        default:
                            System.out.println("Masukkan pilihan yang tepat!");
                    }
                    if (updatedMenu != null) {
                        updatedMenu.setId(updateId);
                        menuService.updateMenuById(updateId, updatedMenu);
                    }

                    break;
                case 4:
                    System.out.println("==== Menu Makan Siang Gratis ====");
                    System.out.println();
                    System.out.println("Masukkan ID menu yang akan dihapus: ");
                    int deleteId = scanner.nextInt();
                    menuService.deleteMenuById(deleteId);
                    break;
                case 5:
                    System.out.println("==== Menu Makan Siang Gratis ====");
                    System.out.println();
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                default:
                    System.out.println("==== Menu Makan Siang Gratis ====");
                    System.out.println();
                    System.out.println("Masukkan pilihan yang tepat!");
            }
        }
    }
}

package com.bootcamp.mbg.impl;

import com.bootcamp.mbg.FreeLunchMenu;
import com.bootcamp.mbg.MenuService;

public class MenuServiceImpl implements MenuService {
    private FreeLunchMenu[] menus = new FreeLunchMenu[10];
    private int count = 0;

    @Override
    public void addMenu(FreeLunchMenu menu) {
        if (count < menus.length) {
            menus[count++] = menu;
            System.out.println("Menu berhasil ditambahkan.");
            displayMenu();
        } else {
            System.out.println("Semua slot menu sudah terisi.");
        }
    }

    @Override
    public void displayMenu() {
        if (count == 0) {
            System.out.println("Menu belum tersedia.");
            return;
        }
        for (int i = 0; i < count; i++) {
            menus[i].displayInfo();
        }
        System.out.println();
    }

    @Override
    public void updateMenuById(int id, FreeLunchMenu menu) {
        for (int i = 0; i < count; i++) {
            if (menus[i].getId() == id) {
                menu.setId(id);
                menus[i] = menu;
                System.out.println("Menu berhasil diperbarui.");
                displayMenu();
                return;
            }
        }
        System.out.println("ID menu tidak ditemukan.");
        System.out.println();
    }

    @Override
    public void deleteMenuById(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (menus[i].getId() == id) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    menus[j] = menus[j + 1];
                }
                menus[--count] = null;

                for (int k = 0; k < count; k++) {
                    menus[k].setId(k + 1);
                }

                System.out.println("Menu berhasil dihapus.");
                displayMenu();
                return;
            }
        }
        if (!found) {
            System.out.println("ID menu tidak ditemukan.");
            System.out.println();
        }
    }
}

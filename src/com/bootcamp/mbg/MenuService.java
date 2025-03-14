package com.bootcamp.mbg;

public interface MenuService {
    void addMenu(FreeLunchMenu menu);
    void displayMenu();
    void updateMenuById(int id, FreeLunchMenu menu);
    void deleteMenuById(int id);
}

package com.bootcamp.gosling7.example_static;

public class UtilApp {
    public static void main(String[] args) {
        String name = InputUtil.inputString("Input Nama");
        String address = InputUtil.inputString("Input Alamat");
        Integer age = InputUtil.inputInt("Umur");
        String idrFormat = UtilCurrency.formatIDR(100000);

        System.out.println(idrFormat);
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
    }
}

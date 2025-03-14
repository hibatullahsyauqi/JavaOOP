package com.bootcamp.gosling7.phone;

import com.bootcamp.gosling7.phone.impl.PhoneImpl;

public class UserPhone {
    private final String name;
    private final PhoneImpl phone;

    public UserPhone(String name, String phoneName, int battery, PhoneImpl phone) {
        this.name = name;
        this.phone = phone;
        phone.setCurrentBattery(battery);
        phone.setPhoneName(phoneName);
    }

    public void turnOn() {
        System.out.print(name + "! ");
        phone.powerOn();
    }

    public void turnOff() {
        System.out.print(name + "! ");
        phone.powerOff();
    }

    public void increaseVolume(int volume) {
        phone.volumeUp(volume);
    }

    public void decreaseVolume(int volume) {
        phone.volumeDown(volume);
    }

    public void charging() {
        phone.charging();
    }


    public void showBattery() {
        phone.showBattery();
    }

    public void using() {
        phone.using();
    }
}

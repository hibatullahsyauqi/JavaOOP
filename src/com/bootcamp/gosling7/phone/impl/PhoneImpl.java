package com.bootcamp.gosling7.phone.impl;

import com.bootcamp.gosling7.phone.BluetoothDevice;
import com.bootcamp.gosling7.phone.Phone;

public class PhoneImpl implements Phone {
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_BATTERY = 100;
    private final int MIN_BATTERY = 0;
    private int currentVolume;
    private int currentBattery;
    private String phoneName;
    private BluetoothDevice bluetoothDevice;

    public int getCurrentBattery() {
        return currentBattery;
    }

    public void setCurrentBattery(int currentBattery) {
        this.currentBattery = currentBattery;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

//    // method utk connect btooth
//    public void connectBluetooth(BluetoothDevice device) {
//        device.connect();
//    }

    @Override
    public void powerOn() {
        if (currentBattery == 0) {
            System.out.println(phoneName + "'s battery is dead.");
        } else {
            System.out.println(phoneName + " is powered on.");
        }
    }

    @Override
    public void powerOff() {
        System.out.println(phoneName + " is powered off.");
    }

    @Override
    public void volumeUp(int volume) {
        if (currentVolume != MAX_VOLUME) {
            currentVolume += volume;
            if (currentVolume > MAX_VOLUME) {
                currentVolume = MAX_VOLUME;
            }
        }
        System.out.println("Volume is now " + currentVolume + ".");
    }

    @Override
    public void volumeDown(int volume) {
        if (currentVolume != MIN_VOLUME) {
            currentVolume -= volume;
            if (currentVolume < MIN_VOLUME) {
                currentVolume = MIN_VOLUME;
            }
        }
        System.out.println("Volume is now " + currentVolume + ".");
    }

    @Override
    public void charging() {
        System.out.println(phoneName + " is charging. Energy is restoring.");
        if (currentBattery < MAX_BATTERY) {
            currentBattery++;
        }
    }

    @Override
    public void showBattery() {
        System.out.println(phoneName + "'s battery is now " + getCurrentBattery() + ".");
    }

    @Override
    public void using() {
        System.out.println(phoneName + " is being used. Energy will be consumed.");
        if (currentBattery < MIN_BATTERY) {
            currentBattery--;
        }
    }
}

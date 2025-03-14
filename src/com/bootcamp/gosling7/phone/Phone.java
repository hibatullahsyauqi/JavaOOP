package com.bootcamp.gosling7.phone;

public interface Phone {
    void powerOn();
    void powerOff();
    void volumeUp(int volume);
    void volumeDown(int volume);
    void charging();
    void setCurrentBattery(int battery);
    void showBattery();
    void using();
    //void connectBluetooth(BluetoothDevice device);
}

package com.bootcamp.gosling7.phone.impl;

import com.bootcamp.gosling7.phone.BluetoothDevice;

public class BluetoothHeadsetImpl implements BluetoothDevice {
    String deviceName;
    boolean isConnected = false;

//    public BluetoothHeadset(String deviceName) {
//        this.deviceName = deviceName;
//    }

    public String getDeviceName() {
        return deviceName;
    }


}

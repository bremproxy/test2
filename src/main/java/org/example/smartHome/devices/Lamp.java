package org.example.smartHome.devices;

import org.example.smartHome.options.Light;

public class Lamp implements SmartDevices{
    private boolean statusEnabled;

    public void turnOn(){
        statusEnabled = true;
        System.out.println("лампа включена");
    }

    public void turnOff(){
        statusEnabled = false;
        System.out.println("лампа выключена");
    }

}

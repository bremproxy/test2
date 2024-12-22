package org.example.smartHome.devices;

import org.example.smartHome.options.Light;

public class Lamp implements SmartDevices{
    private boolean StatusEnabled;

    public void turnOn(){
        StatusEnabled = true;
        System.out.println("лампа включена");
    }

}

package org.example.smartHome.devices;

public class Column implements SmartDevices{
    private boolean StatusEnabled;

    public void turnOn(){
        StatusEnabled = true;
        System.out.println("колонка включена");
    }

}

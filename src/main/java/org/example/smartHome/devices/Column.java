package org.example.smartHome.devices;

public class Column implements SmartDevices{
    private boolean statusEnabled;

    public void turnOn(){
        statusEnabled = true;
        System.out.println("колонка включена");
    }

    public void turnOff(){
        statusEnabled = false;
        System.out.println("колонка выключена");
    }

}

package org.example.smartHome.devices;

public class Hoover implements SmartDevices{
        private boolean statusEnabled;

        public void turnOn(){
            statusEnabled = true;
            System.out.println("пылесос включен");
        }

        public void turnOff(){
            statusEnabled = false;
            System.out.println("пылесос выключен");
        }
}

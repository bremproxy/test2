package org.example.smartHome.options;

public class Light implements DevicesOptions{
    public boolean StatusLight;

    public void lightIndicator(){
        StatusLight = true;
        System.out.println("свет горит");

    }
}

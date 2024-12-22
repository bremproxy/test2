package org.example.smartHome.options;

public class Light implements DevicesOptions{
    public boolean indicator;
    public boolean lightOn;

    public void indicator(){
        indicator = true;
        System.out.println("лампочка горит");

    }

    public void setLight(){
        lightOn = true;
        System.out.println("Свет горит");
    }


}

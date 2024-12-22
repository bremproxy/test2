package org.example.smartHome.options;

public class Light implements DevicesOptions{
    public boolean indicator;
    public boolean statusLight;

    public void indicator(){
        indicator = true;
        System.out.println("лампочка горит");

    }

    public void indicatorOff(){
        indicator = false;
        System.out.println("лампочка не горит");

    }

    public void setLightOn(){
        statusLight = true;
        System.out.println("Свет горит");
    }

    public void setLightOff(){
        statusLight = false;
        System.out.println("Свет не горит");
    }

}

package org.example.smartHome.options;

public class Music implements DevicesOptions{
    public boolean indicator;
    public boolean StatusMusic;

    public void indicator(){
        indicator = true;
        System.out.println("лампочка горит");

    }

    public void playMusic(){
        StatusMusic = true;
        System.out.println("музыка играет");

    }
}
package org.example.smartHome.options;

public class Music implements DevicesOptions{
    public boolean indicator;
    public boolean statusMusic;

    public void indicator(){
        indicator = true;
        System.out.println("лампочка горит");

    }

    public void playMusicOn(){
        statusMusic = true;
        System.out.println("музыка играет");

    }

    public void playMusicOff(){
        statusMusic = false;
        System.out.println("музыка не играет");

    }
}
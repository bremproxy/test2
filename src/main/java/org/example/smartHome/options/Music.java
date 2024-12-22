package org.example.smartHome.options;

public class Music implements DevicesOptions{
    public boolean StatusMusic;

    public void MusicIndicator(){
        StatusMusic = true;
        System.out.println("играет музыка");

    }
}
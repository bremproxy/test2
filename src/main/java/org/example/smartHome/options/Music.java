package org.example.smartHome.options;

public class Music implements DevicesOptions{
    public boolean indicator;
    public boolean statusMusic;
    private int volume = 50;

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

    public void increaseVolume() {
        if (volume < 100) {
            volume += 10;
            System.out.println("Громкость увеличена до: " + volume);
        } else {
            System.out.println("Громкость уже на максимуме!");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("Громкость уменьшена до: " + volume);
        } else {
            System.out.println("Громкость уже на минимуме!");
        }
    }

    public int getVolume() {
        return volume;
    }

}
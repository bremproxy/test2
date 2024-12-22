package org.example;

import org.example.smartHome.devices.Column;
import org.example.smartHome.devices.Lamp;
import org.example.smartHome.options.Light;
import org.example.smartHome.options.Music;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> validLight = new HashSet<>();
        validLight.add("Свет");
        validLight.add("Включи свет");
        validLight.add("свет");
        validLight.add("включи свет");

        Set<String> validMusic = new HashSet<>();
        validMusic.add("Музыка");
        validMusic.add("Включи музыку");
        validMusic.add("музыка");
        validMusic.add("включи музыку");

        Set<String> validVolume = new HashSet<>();
        validVolume.add("погромче");
        validVolume.add("потише");
        validVolume.add("громкость");

        String input;

        Music music = new Music();
        Lamp lamp = new Lamp();
        Light light = new Light();
        Column column = new Column();

        while (true) {
            System.out.println("Привет, я могу включить свет или включить музыку, что вы хотете сделать?");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("выход")) {
                System.out.println("Программа завершена.");
                break;
            } if (validVolume.contains(input)) {
                    System.out.println("Принято: " + input);
                    if (input.contains("погромче")) {
                        music.increaseVolume();
                    } else if (input.contains("потише")) {
                        music.decreaseVolume();
                    } else {
                        System.out.println("Текущая громкость: " + music.getVolume());
                    }
                } else if (validLight.contains(input)) {
                System.out.println("принято " + input + " включаю");
                lamp.turnOn();
                light.indicator();
                light.setLightOn();
            } else if (validMusic.contains(input)) {
                System.out.println("принято " + input + " включаю");
                music.indicator();
                column.turnOn();
                music.playMusicOn();
            } else {
                System.out.println("Неверная команда. Попробуйте снова.");
            }
        }
    }
}
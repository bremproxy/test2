package org.example;

import org.example.smartHome.devices.Column;
import org.example.smartHome.devices.Hoover;
import org.example.smartHome.devices.Lamp;
import org.example.smartHome.enums.Rooms;
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
        //validMusic.add("Музыка");
        //validMusic.add("Включи музыку");
        validMusic.add("музыка");
        validMusic.add("выключи музыку");

        Set<String> validVolume = new HashSet<>();
        validVolume.add("погромче");
        validVolume.add("потише");
        validVolume.add("громкость");

        Set<String> arrRoom = new HashSet<>();
        arrRoom.add("комнаты");

        Set<String> validHover = new HashSet<>();
        validHover.add("пылесос");

        String input;

        Music music = new Music();
        Lamp lamp = new Lamp();
        Light light = new Light();
        Column column = new Column();
        Hoover hoover = new Hoover();


        while (true) {
            System.out.println("___________________\nПривет, я умный дом!\nТы можешь попросить меня:\nВключить свет\nВключить и выключить музыку\nИзменить громкость, узнать текущий уровень\nВкключить пылесос\nИнформация по комнатам\n___________________\n");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("выход")) {
                System.out.println("Программа завершена.");
                break;
            }
            if (validVolume.contains(input)) {
                System.out.println("Принято: " + input);
                if (input.contains("погромче")) {
                    music.increaseVolume();
                } else if (input.contains("потише")) {
                    music.decreaseVolume();
                } else {
                    System.out.println("Текущая громкость: " + music.getVolume());
                }
            } else if (validLight.contains(input)) {
                System.out.println("принято: " + input + " включаю");
                lamp.turnOn();
                light.indicator();
                light.setLightOn();
            } else if (arrRoom.contains(input)) {
                System.out.println("принято: " + input + " вот список комнат");
                Rooms.arrRoom();
            } else if (validHover.contains(input)){
                System.out.println("принято: " + input + " включаю");
                hoover.turnOn();
                light.indicator();
            } else if (validMusic.contains(input)) {
                System.out.println("принято: " + input + " включаю");
                if (input.contains("выключи музыку")) {
                    music.playMusicOff();
                    column.turnOff();
                    music.indicatorOff();
                } else if (input.contains("музыка")) {
                    music.indicator();
                    column.turnOn();
                    music.playMusicOn();
                }
            } else {
                    System.out.println("Неверная команда. Попробуйте снова.");
                }
            }
        }
    }
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

        String input;

        while (true) {
            System.out.println("Привет, я могу включить свет или включить музыку, что вы хотете сделать?");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("выход")) {
                System.out.println("Программа завершена.");
                break;
            } if (validLight.contains(input)) {
                System.out.println("принято " + input + " включаю");
                Lamp lp = new Lamp();
                lp.turnOn();
                Light lg = new Light();
                lg.indicator();
                lg.setLight();
            } else if (validMusic.contains(input)) {
                System.out.println("принято " + input + " включаю");
                Music music = new Music();
                music.indicator();
                Column column = new Column();
                column.turnOn();
                music.playMusic();
            } else {
                System.out.println("Неверная команда. Попробуйте снова.");
            }
        }
    }
}
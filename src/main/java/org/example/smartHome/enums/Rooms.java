package org.example.smartHome.enums;

public enum Rooms {
    KITCHEN ("Кухня", 20),
    BEDROOM ("Спальня", 23),
    CHILDREN ("Детская", 21),
    TOILET ("Туалет", 4),
    BATROOM ("Ванная", 5),
    CARRIDOR ("Коридор", 15),
    BALCONY("Балкон", 6);

    public String name;
    public Integer squareMeter;

    Rooms(String name, Integer squareMeter){
        this.name = name;
        this.squareMeter = squareMeter;
    }


    public static void arrRoom(){
        String[] rooms = {KITCHEN.name, BEDROOM.name, CHILDREN.name, TOILET.name, BATROOM.name, CARRIDOR.name, BALCONY.name};
        for (String room : rooms){
            System.out.println("Комнаты: " + room);
        }
    }
}

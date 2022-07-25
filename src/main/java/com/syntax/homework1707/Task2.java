package com.syntax.homework1707;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google,
     2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/
    public static void main(String[] args) {
        Map<Integer, String> floors = new TreeMap<>();
        floors.put(1,"Google");
        floors.put(2,"Syntax");
        floors.put(3,"Facebook");
        floors.put(4,"Instagram");
        floors.put(5,"Twitter");
        floors.put(6,"Viber");
        floors.put(7,"Telegram");
        System.out.println(floors);
        System.out.println(floors.size());

        floors.put(5,"WhatsApp");
        System.out.println(floors);
        System.out.println(floors.size());

        floors.put(8,"Google");
        System.out.println(floors);
        System.out.println(floors.size());

        floors.replace(4,"Apple");
        System.out.println(floors);

        floors.remove(7);
        System.out.println(floors);

    }
}

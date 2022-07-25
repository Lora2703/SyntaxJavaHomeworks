package com.syntax.homework1707;

import javafx.embed.swt.SWTFXUtils;

import java.util.*;

public class Task3 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

    public static void main(String[] args) {
        Map<String,String> countries = new TreeMap<>();
        countries.put("Ukraine", "Kyiv");
        countries.put("USA", "Washington, DC");
        countries.put("Poland", "Warshava");
        countries.put("Hungary", "Budapesht");
        countries.put("Greece", "Athens");

        Set<String> keys = countries.keySet();
        System.out.println(keys);

        for (String key:keys){
            System.out.println(key+" "+countries.get(key));
        }
        System.out.println("-----------------------------------------");
        Iterator<String> iterator = countries.keySet().iterator();
        while(iterator.hasNext()){
            String it = iterator.next();
            System.out.println(it+" "+countries.get(it));
        }
        System.out.println("-------------------------------------------");
        Collection<String> values = countries.values();
        for (String value:values){
            System.out.println(value);
        }
        System.out.println("---------------------------------------------");
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }



    }
}

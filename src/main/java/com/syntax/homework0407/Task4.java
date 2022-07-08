package com.syntax.homework0407;
/*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("milk");
        drinks.add("juice");
        drinks.add("fresh");
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}

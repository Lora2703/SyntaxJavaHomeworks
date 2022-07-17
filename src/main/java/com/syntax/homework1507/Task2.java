package com.syntax.homework1507;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;*/
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Acapulco");
        cities.add("Los Angeles");
        cities.add("Las Vegas");
        cities.add("Atlanta");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }


}

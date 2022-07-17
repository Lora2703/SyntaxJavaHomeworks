package com.syntax.homework1507;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    /*Create a Set collection in which you need to add names of the countries. In this set we want all
    objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.*/
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Greece");
        for (String country:countries){
            System.out.println(country);
        }
        System.out.println("--------------------------------");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

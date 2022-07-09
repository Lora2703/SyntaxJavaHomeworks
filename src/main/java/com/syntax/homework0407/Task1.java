package com.syntax.homework0407;
/*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Patrick");
        list.add("Diter");
        list.add("Jack");
        list.add("John");
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Diter"));
        System.out.println("Size of list is "+list.size());
        for(String l:list){
            System.out.println(l);
        }
    }
}

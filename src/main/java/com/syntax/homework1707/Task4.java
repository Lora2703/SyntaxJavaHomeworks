package com.syntax.homework1707;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task4 {
    /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
    public static void main(String[] args) {
        Map<Integer,String> bestBuy = new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(7459875,"Modem");
        bestBuy.put(7249637,"Laptop");
        bestBuy.put(7499856,"Scanner");

        Set<Map.Entry<Integer,String>> entries = bestBuy.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry);
        }
    }
}

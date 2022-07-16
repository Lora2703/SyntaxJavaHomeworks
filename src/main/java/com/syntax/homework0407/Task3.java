package com.syntax.homework0407;
/*Create an arrayList of words. Remove every word that ends with “e”.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("peace");
        words.add("summer");
        words.add("winter");
        words.add("spring");
        words.add("coffee");
        words.add("autumn");
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(words);
    }
}

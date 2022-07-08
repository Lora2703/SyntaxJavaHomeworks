package com.syntax.homework0407;
/*Create an arrayList of words. Remove every word that ends with “e”.*/

import java.util.ArrayList;
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
        List<String> words1 = new ArrayList<>();
        for(String word:words){
            if(!word.endsWith("e")){
                words1.add(word);
            }
        }
        System.out.println(words1);
    }
}

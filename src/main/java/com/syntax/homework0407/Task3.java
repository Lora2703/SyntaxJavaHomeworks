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
        for(int i=0; i< words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }

        System.out.println(words);
    }
}

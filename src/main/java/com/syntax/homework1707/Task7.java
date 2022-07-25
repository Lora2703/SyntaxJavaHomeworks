package com.syntax.homework1707;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task7 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        Collection<String> strings = new LinkedHashSet<>();
        strings.add("The");
        strings.add("show");
        strings.add("must");
        strings.add("go");
        strings.add("on!");

        StringBuilder sentence = new StringBuilder();
        for(String str:strings){
            sentence.append(str);
            sentence.append(" ");
        }
        System.out.println(sentence);
    }
}

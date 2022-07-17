package com.syntax.homework1507;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task0 {
    /*How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");*/
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        Set<String> aSet = new HashSet<>();
        aSet.addAll(aList);
        System.out.println(aSet);
    }
}

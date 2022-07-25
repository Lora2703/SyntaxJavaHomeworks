package com.syntax.homework1707;

import java.util.Collection;
import java.util.LinkedList;

public class Task8 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/
    public static void main(String[] args) {
        Collection<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int sum = 0;
        for (Integer number:numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}

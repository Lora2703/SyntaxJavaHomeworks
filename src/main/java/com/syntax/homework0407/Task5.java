package com.syntax.homework0407;
/*Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.*/

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for(int i=2; i<=500; i+=2){
            evenNumbers.add(i);
        }
        List<Integer> evenNumbers1 = new ArrayList<>();
        for(Integer evenNumber:evenNumbers){
            if(evenNumber%5!=0){
                evenNumbers1.add(evenNumber);
            }
        }
        System.out.println(evenNumbers1);
    }
}

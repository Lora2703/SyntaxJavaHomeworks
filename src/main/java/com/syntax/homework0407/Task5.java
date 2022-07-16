package com.syntax.homework0407;
/*Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for(int i=2; i<=500; i+=2){
            evenNumbers.add(i);
        }
        Iterator<Integer> iterator = evenNumbers.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }

        System.out.println(evenNumbers);
    }
}

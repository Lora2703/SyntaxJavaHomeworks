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

        for(int i=0; i< evenNumbers.size(); i++){
            if(evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);
    }
}

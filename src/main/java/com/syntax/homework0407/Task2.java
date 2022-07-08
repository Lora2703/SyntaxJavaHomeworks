package com.syntax.homework0407;

/*Create an arraylist of cars and retrieve all the values using 3 different ways.*/

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Infinity");
        cars.add("Mercedes");

        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("-----------------------------");

        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------------------");

        System.out.println(cars);
    }

}

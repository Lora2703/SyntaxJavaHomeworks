package com.syntax.homework1707;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee
     who gets the highest salary. Output should be in the below format
John Smith=$100000*/
    public static void main(String[] args) {
        Map<String,Integer> employees = new HashMap<>();
        employees.put("Ted Johnson",100000);
        employees.put("Jayson Moor",120000);
        employees.put("Paul Adams",110000);
        employees.put("Belinda Kelly",130000);
        int maxSalary = 0;
        String name="";
        for (Map.Entry<String,Integer> entry:employees.entrySet()){
            if(entry.getValue() > maxSalary){
                maxSalary = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name+"=$"+maxSalary);
    }


}

package com.syntax.homework1606;

public class Task2 {
  /*  Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/

    public static String reverseStr(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

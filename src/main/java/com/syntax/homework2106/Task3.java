package com.syntax.homework2106;

public class Task3 {
    /*Create 1 class with a static method that has 3 overloaded forms. Then call each
    overloaded method with specific arguments and observe result.
     */

    static void printLang(){
        System.out.println("I love all programming languages");
    }
    static void printLang(String lang){
        System.out.println("I love "+lang);
    }
    static void printlang(String lang1, String lang2){
        System.out.println("I love "+lang1+" and "+lang2+" more than other programming languages");
    }
}

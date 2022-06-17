package com.syntax.homework1606;

public class Task3 {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private static String onlyVowels(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y'){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Task3 task = new Task3();
        System.out.println(onlyVowels("only vowels"));
    }
}

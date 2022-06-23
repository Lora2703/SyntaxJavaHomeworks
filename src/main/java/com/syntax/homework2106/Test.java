package com.syntax.homework2106;

public class Test {
    public static void main(String[] args) {
        System.out.println(Square.square(10));
        System.out.println(Square.square(10, 20));
        System.out.println(Square.square(10, 10, 10));

        System.out.println("----------------------------------");

        Programming ob1 = new Programming();
        Programming ob2 = new Programming("Java");

        System.out.println("----------------------------------");

        Task3.printLang();
        Task3.printLang("Java");
        Task3.printlang("Java", "C");
    }
}

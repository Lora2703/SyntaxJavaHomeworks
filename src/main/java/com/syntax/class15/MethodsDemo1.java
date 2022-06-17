package com.syntax.class15;

public class MethodsDemo1 {

    void method1() {
        System.out.println("I can use print statements in a void type method");
        int num = 0;
        //method with void return type can't be assigned to variable
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1 = new MethodsDemo1();
        methodsDemo1.method1();
    }


}





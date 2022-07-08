package com.syntax.homework1906;


public class Test {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Taras", "+380671234567","Kyiv");
        userInfo.userDetail();

        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());
    }
}

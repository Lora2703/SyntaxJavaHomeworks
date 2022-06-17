package com.syntax.homework1606;

public class Students {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
     with different marks. Your program should print an average mark of each students name.
     */
     String name;
     int mathGrade;
     int historyGrade;
     int physicsGrade;

    public int averageGrade(int mathGrade, int historyGrade, int physicsGrade){
        return (mathGrade+historyGrade+physicsGrade)/3;
    }

}


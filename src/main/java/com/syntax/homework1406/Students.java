package com.syntax.homework1406;

import com.syntax.homework1606.Task6;

public class Students {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

    static int numberOfStudents;
    String name;
    int id;

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "John";
        student1.id = 123456;
        numberOfStudents = 1;
        Students student2 = new Students();
        student2.name = "Ann";
        student2.id = 456789;
        numberOfStudents +=1;
        Students student3 = new Students();
        student3.name = "Jack";
        student3.id = 123789;
        numberOfStudents +=1;



        Task6 book2 = new Task6("Shevchenko", "Kobzar");


    }
}

package com.syntax.homework1507;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    /*Create a Set collection that will hold Objects of Student Type. In this set we do not care about
     the insertion order. Each student object should have name and studentID. Display name of each student.
     */
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("John", 123));
        students.add(new Student("Mary", 456));
        students.add(new Student("Fidel", 789));
        students.add(new Student("Patrick", 321));
        students.add(new Student("Ann", 654));
        students.add(new Student("Pamela", 987));

        for(Student student:students){
            System.out.println(student.name);
        }
    }
}
class Student{
    String name;
    int studentID;

    Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
    }
}

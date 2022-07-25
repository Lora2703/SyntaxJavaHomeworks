package com.syntax.homework1707;

import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId
 and a Person Object. Print each object details.*/
    public static void main(String[] args) {
        Map<Integer,Person> persons = new TreeMap<>();
        persons.put(1, new Person("Paul","Kafka",25,110000));
        persons.put(2, new Person("John","Smith",23,115000));
        persons.put(3, new Person("Sam","Lloyd",20,100000));

        for(Person p: persons.values()){
            System.out.println(p.toString());
        }

    }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private int salary;


    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

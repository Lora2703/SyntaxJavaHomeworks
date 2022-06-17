package com.syntax.homework1406;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects*/

    static final String CEO = "Sumair";
    int salary;
    int empID;

    public static void main(String[] args) {
        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID = 1;
        employee1.salary = 100000;
        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empID = 2;
        employee2.salary = 110000;

        SyntaxEmployee[] employees = {employee1, employee2};
        for(SyntaxEmployee employee : employees){
            System.out.println(employee.empID+" "+ employee.salary+" "+CEO);
        }
    }
}

package com.syntax.homework1606;

public class Test {
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.sumElem(new int[]{1, 2, 3, 4, 5}));

        System.out.println("------------------------------------");

        System.out.println("Reversed " + Task2.reverseStr("abcd"));

        System.out.println("------------------------------------");

        Task4 task4 = new Task4();
        Task4 anotherTask4 = new Task4(25, "No arguments onstructor", "Constructors");
        System.out.println(task4);
        System.out.println(anotherTask4);

        System.out.println("------------------------------------");

        Students student1 = new Students();
        student1.name = "Patrick";
        student1.mathGrade = 85;
        student1.historyGrade = 78;
        student1.physicsGrade = 91;
        Students student2 = new Students();
        student2.name = "Ali";
        student2.mathGrade = 77;
        student2.historyGrade = 82;
        student2.physicsGrade = 84;
        Students student3 = new Students();
        student3.name = "Alisa";
        student3.mathGrade = 69;
        student3.historyGrade = 88;
        student3.physicsGrade = 74;
        Students student4 = new Students();
        student4.name = "Richard";
        student4.mathGrade = 89;
        student4.historyGrade = 99;
        student4.physicsGrade = 79;
        Students student5 = new Students();
        student5.name = "Sarah";
        student5.mathGrade = 94;
        student5.historyGrade = 96;
        student5.physicsGrade = 97;
        Students[] students = {student1, student2, student3, student4, student5};
        for (Students student : students) {
            System.out.println("Average grade of " + student.name + " is " + student.averageGrade(student.mathGrade,
                    student.historyGrade, student.physicsGrade));
        }
        System.out.println("--------------------------------------------");
//
//        Task6 book1 = new Task6("Shevchenko", "Kobzar");
//        Task6 book2 = new Task6("Shevchenko", "Kobzar", "Kyiv");
//        Task6 book3 = new Task6("Shevchenko", "Kobzar", "Kyiv", 1986);

        System.out.println("--------------------------------------------");

        Student student = new Student("Semen", "Kyiv");
        System.out.println(student.displayInfo());

        System.out.println("--------------------------------------------");

        Book book = new Book("Shevchenko", "Kobzar", "Kyiv", 1986);
        System.out.println(book.bookAuthor+" "+book.bookName+" "+book.bookEdition+" "+book.pageAmount);


    }
}

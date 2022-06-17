package com.syntax.homework1606;

public class Task6 {
    /*Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    String bookAuthor;
    String bookName;
    String bookEdition;
    int pageAmount;

    private Task6(){}

    public Task6(String author, String name){
        bookAuthor = author;
        bookName = name;
    }

    Task6(String author, String name, String edition){
        bookAuthor = author;
        bookName = name;
        bookEdition = edition;
    }

    protected Task6(String author, String name, String edition, int amount){
        bookAuthor = author;
        bookName = name;
        bookEdition = edition;
        pageAmount = amount;
    }

    Task6 book1 = new Task6();
    Task6 book2 = new Task6("Shevchenko", "Kobzar");
    Task6 book3 = new Task6("Shevchenko", "Kobzar", "Kyiv");
    Task6 book4 = new Task6("Shevchenko", "Kobzar", "Kyiv", 1986);



}

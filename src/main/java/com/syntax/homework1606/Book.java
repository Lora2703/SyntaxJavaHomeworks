package com.syntax.homework1606;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/

    String bookAuthor;
    String bookName;
    String bookEdition;
    int pageAmount;

    Book(String author, String name){
        bookAuthor = author;
        bookName = name;
    }

    Book(String author, String name, String edition, int amount){
        this(author,name);
        bookEdition = edition;
        pageAmount = amount;
    }

}

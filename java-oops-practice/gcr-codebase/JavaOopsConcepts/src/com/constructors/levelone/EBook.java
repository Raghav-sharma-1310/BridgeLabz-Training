package com.constructors.levelone;

public class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN  : " + ISBN);
        System.out.println("Title : " + title);
    }
    
    public static void main(String[] args) {

        EBook ebook = new EBook("ISBN123", "Java Basics", "James Gosling");

        ebook.displayDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
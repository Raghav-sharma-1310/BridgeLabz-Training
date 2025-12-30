package com.objectmodelling.levelone;

public class MainAggregation {

    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        Library centralLibrary = new Library("Central Library");
        Library cityLibrary = new Library("City Library");

        centralLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        centralLibrary.showBooks();
        cityLibrary.showBooks();
    }
}

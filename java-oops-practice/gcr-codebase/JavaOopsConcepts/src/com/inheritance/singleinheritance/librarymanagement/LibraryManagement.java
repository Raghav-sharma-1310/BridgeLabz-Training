package com.inheritance.singleinheritance.librarymanagement;

public class LibraryManagement {
	
    public static void main(String[] args) {

        Author book1 = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java best practices"
        );

        book1.displayInfo();
    }
}

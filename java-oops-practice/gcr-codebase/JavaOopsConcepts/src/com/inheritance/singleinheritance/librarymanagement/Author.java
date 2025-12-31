package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear); 
        this.authorName = authorName;
        this.bio = bio;
    }
    
    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}

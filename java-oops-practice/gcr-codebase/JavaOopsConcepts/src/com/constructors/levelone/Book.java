package com.constructors.levelone;

public class Book {
	String title;
	String author;
	int price;
	
	private String[] bookName = {"Animal Fram", "Family Wisdom", "APJ Abdul kalam", "Harry Potter"};
	private boolean[] isAvailable = {true, false, true, true};
	
	// Default Constructor
	public Book() {
		title = "Animal Farm";
		author ="George Orwell";
		price = 350;
	}
	// Parameterized Constructor
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public boolean isAvailability(String input) {
		for(int i=0; i<bookName.length; i++) {
			if(bookName[i].equals(input)) {
				return isAvailable[i];
			}
		}
		return false;
	}
	// Display the details of the book
    public void displayBookDetails() {
    	System.out.println("The title of book : " + title);
    	System.out.println("The Author of book : " + author);
    	System.out.println("The price of book : " + price);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		System.out.println("The Book 1 details : ");
		book1.displayBookDetails();
		Book book2 = new Book("Family Wisdom", "Robin Sharma", 400);
		System.out.println("The Book 2 details : ");
		book2.displayBookDetails();

	}

}

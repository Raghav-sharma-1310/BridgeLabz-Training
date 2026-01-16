package com.day4.smartshelf;

public class SmartShelfMain {
	
    public static void main(String[] args) {

        Book[] shelf = new Book[10];
        int count = 0;

        SmartShelf smartShelf = new SmartShelf();

        shelf[count++] = new Book("Java Programming", "James Gosling");
        smartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Algorithms", "CLRS");
        smartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Data Structures", "Mark Allen Weiss");
        smartShelf.insertionSort(shelf, count);

        shelf[count++] = new Book("Clean Code", "Robert C. Martin");
        smartShelf.insertionSort(shelf, count);

        System.out.println("📚 Sorted Reading List:");
        smartShelf.displayShelf(shelf, count);
    }
    
}

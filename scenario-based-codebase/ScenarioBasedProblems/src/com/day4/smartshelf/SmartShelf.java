package com.day4.smartshelf;

public class SmartShelf {
	
    void insertionSort(Book[] books, int size) {

        for (int i = 1; i < size; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    void displayShelf(Book[] books, int size) {
        for (int i = 0; i < size; i++) {
            books[i].display();
        }
    }
}

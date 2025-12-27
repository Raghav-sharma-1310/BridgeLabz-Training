package com.constructors.levelone;
import java.util.*;
public class LibraryBookSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Book b = new Book();
		boolean available = b.isAvailability(input);
		if(available) {
			System.out.println("This Book is available");
		}
		else {
			System.out.println("This Book is available");
		}
	}

}

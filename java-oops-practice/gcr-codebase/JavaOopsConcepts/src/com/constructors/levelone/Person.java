package com.constructors.levelone;

public class Person {
	String name;
	int age;
	//Default constructor
	public Person() {
		name = "Ram";
		age = 16;
	}
	//Parameterized constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Copy constructor
	public Person(Person previousPerson ) {
		this.name = previousPerson.name;
		this.age = previousPerson.age;
	}
	// Display the details of the person
	public void displayPeronDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
        // Call constructor
		Person person = new Person();
		System.out.println("---Details of Person 1---");
		person.displayPeronDetails();
		System.out.println();
		Person person2 = new Person("Shyam", 22);
		System.out.println("---Details of Person 2---");
		person2.displayPeronDetails();
		System.out.println();
		Person person3 = new Person(person2);
		System.out.println("---Details of Person 3---");
		person3.displayPeronDetails();

	}

}

package com.constructors.levelone;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void displayDetails() {
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + getCGPA());
    }
    public static void main(String[] args) {

        PostgraduateStudent ps =
                new PostgraduateStudent(101, "rajeev", 8.5);

        ps.displayDetails();
        ps.setCGPA(9.0);
        System.out.println("Updated CGPA: " + ps.getCGPA());
    }
}
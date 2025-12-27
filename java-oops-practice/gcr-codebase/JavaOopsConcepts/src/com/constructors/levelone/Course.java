package com.constructors.levelone;

public class Course {

    // Instance variables
    String courseName;
    int duration; 
    double fee;

    // Class variable
    static String instituteName = "XYZ Group of Institute";

   
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

 
    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration );
        System.out.println("Total Fee     : " + fee);
        System.out.println("Institute     : " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {

        Course c1 = new Course("Java", 6, 12000);
        Course c2 = new Course("Python", 4, 9000);

        c1.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("XYZ Technologies");
        c2.displayCourseDetails();
    }
}

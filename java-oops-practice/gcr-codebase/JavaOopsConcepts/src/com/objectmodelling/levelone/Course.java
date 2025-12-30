package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
    	System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getProfessorName());
        }

        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getStudentName());
        }
    }
    
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getProfessorName()
                + " assigned to " + courseName);
    }
}

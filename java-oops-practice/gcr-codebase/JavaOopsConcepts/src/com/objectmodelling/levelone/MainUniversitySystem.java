package com.objectmodelling.levelone;

public class MainUniversitySystem {

    public static void main(String[] args) {

        Student s1 = new Student("Rohan");
        Student s2 = new Student("Neha");

        Professor prof1 = new Professor("Dr. Sharma");

        Course java = new Course("Java Programming");
        Course dbms = new Course("DBMS");

        java.assignProfessor(prof1);

        s1.enrollCourse(java);
        s1.enrollCourse(dbms);
        s2.enrollCourse(java);

        java.showEnrolledStudents();
        dbms.showEnrolledStudents();
    }
}

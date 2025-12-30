package com.objectmodelling.levelone;

public class MainSchoolAssociation {

    public static void main(String[] args) {

        School school = new School("Green Valley School");
        Student s1 = new Student("Rohan");
        Student s2 = new Student("Aman");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(math);
        s1.enrollCourse(science);
        s2.enrollCourse(science);

        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}

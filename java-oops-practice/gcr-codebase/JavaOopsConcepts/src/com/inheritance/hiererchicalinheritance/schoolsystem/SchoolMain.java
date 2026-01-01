package com.inheritance.hiererchicalinheritance.schoolsystem;

public class SchoolMain {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Maths");
        Student s = new Student("Ram", 21, "A");
        Staff st = new Staff("Raj", 35, "Admin");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

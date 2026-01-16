package com.day4.examcell;

public class Student {
    String rollNo;
    String name;
    int score;

    Student(String rollNo, String name, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println(rollNo + " | " + name + " | Score: " + score);
    }
}

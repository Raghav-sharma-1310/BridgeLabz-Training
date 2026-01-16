package com.day4.examcell;

public class ExamCellMain {
    public static void main(String[] args) {

        Student[] students = {
            new Student("C01-101", "Ravi", 88),
            new Student("C02-201", "Anita", 92),
            new Student("C01-102", "Suman", 85),
            new Student("C03-301", "Karan", 90),
            new Student("C02-202", "Neha", 92)
        };

        ExamCell examCell = new ExamCell();

        examCell.mergeSort(students, 0, students.length - 1);

        System.out.println("State-Level Rank List:");
        examCell.publishRankList(students);
    }
}

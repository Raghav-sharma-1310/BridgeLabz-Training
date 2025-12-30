package com.objectmodelling.levelone;

public class Employee {

    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + employeeName);
    }
}

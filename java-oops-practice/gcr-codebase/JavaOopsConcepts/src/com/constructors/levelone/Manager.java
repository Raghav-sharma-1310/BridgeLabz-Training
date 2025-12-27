package com.constructors.levelone;

public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + getSalary());
    }
    
    public static void main(String[] args) {

        Manager m = new Manager(201, "IT", 75000);
        m.displayDetails();

        m.setSalary(85000);
        System.out.println("Updated Salary: ₹" + m.getSalary());
    }
}
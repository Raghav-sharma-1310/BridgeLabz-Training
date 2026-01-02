package com.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.List;
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Ram", 50000);
        emp1.assignDepartment("IT");

        Employee emp2 = new PartTimeEmployee(102, "Amit", 80, 300);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        System.out.println("---- Employee Details ----\n");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("--------------------------");
        }
    }
}
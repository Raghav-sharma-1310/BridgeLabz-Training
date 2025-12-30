package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void showDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
    
}

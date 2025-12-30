package com.objectmodelling.levelone;

import java.util.ArrayList;

public class DepartmentU {

    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    public DepartmentU(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (Faculty faculty : facultyMembers) {
            System.out.println("- Faculty: " + faculty.getFacultyName());
        }
    }
}

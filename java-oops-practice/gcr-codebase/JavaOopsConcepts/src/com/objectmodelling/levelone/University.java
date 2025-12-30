package com.objectmodelling.levelone;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<DepartmentU> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(DepartmentU department) {
        departments.add(department);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);
        for (DepartmentU department : departments) {
            department.showDepartmentDetails();
        }
    }
}

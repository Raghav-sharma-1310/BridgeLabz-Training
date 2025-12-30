package com.objectmodelling.levelone;

public class MainComposition {

    public static void main(String[] args) {

        Company techCompany = new Company("Tech Solutions");

        Department devDepartment = new Department("Development");
        devDepartment.addEmployee("saurav");
        devDepartment.addEmployee("Neha");

        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee("Amit");

        techCompany.addDepartment(devDepartment);
        techCompany.addDepartment(hrDepartment);

        techCompany.showCompanyDetails();

        // If techCompany object is deleted,
        // all departments and employees are also deleted (Composition)
        techCompany = null;
    }
}

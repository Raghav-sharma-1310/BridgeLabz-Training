package com.objectmodelling.levelone;

public class MainUniversityComposition {

    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University university = new University("National University");

        DepartmentU cs = new DepartmentU("Computer Science");
        DepartmentU it = new DepartmentU("Information Technology");

        cs.addFaculty(f1);
        it.addFaculty(f2);

        university.addDepartment(cs);
        university.addDepartment(it);

        university.showUniversityDetails();

        // Composition proof
        university = null;
        System.out.println("\nUniversity deleted → Departments deleted");
        System.out.println("Faculty objects still exist independently");
    }
}

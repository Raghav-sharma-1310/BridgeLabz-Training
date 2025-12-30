package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Patient {

    private String patientName;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public void viewConsultedDoctors() {
        System.out.println("\nDoctors consulted by " + patientName + ":");
        for (Doctor doctor : consultedDoctors) {
            System.out.println("- Dr. " + doctor.getDoctorName());
        }
    }
}

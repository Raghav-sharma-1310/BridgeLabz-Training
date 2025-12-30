package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Doctor {

    private String doctorName;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);   // Association communication

        System.out.println("Consultation Done:");
        System.out.println("Doctor: Dr. " + doctorName +
                " (" + specialization + ")");
        System.out.println("Patient: " + patient.getPatientName());
    }

    public void viewPatients() {
        System.out.println("\nPatients consulted by Dr. " + doctorName + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
    }
}

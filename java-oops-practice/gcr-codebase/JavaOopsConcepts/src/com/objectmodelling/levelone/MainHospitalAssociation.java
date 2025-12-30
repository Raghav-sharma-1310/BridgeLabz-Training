package com.objectmodelling.levelone;

public class MainHospitalAssociation {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Ram", "Cardiologist");
        Doctor d2 = new Doctor("Mehta", "Neurologist");

        Patient p1 = new Patient("Aman");
        Patient p2 = new Patient("Neha");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospitalDetails();

        // Consultations (Many-to-Many Association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.viewPatients();
        d2.viewPatients();

        p1.viewConsultedDoctors();
        p2.viewConsultedDoctors();
    }
}

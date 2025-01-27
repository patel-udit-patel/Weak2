package com.hospital_patient_management;

// Main class to test the Hospital Patient Management System
public class HospitalManagementSystem {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill() + "\n");
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient("P101", "John Doe", 45, 2000, 5);
        Patient outPatient = new OutPatient("P102", "Jane Smith", 30, 500);

        processPatient(inPatient);
        processPatient(outPatient);

        // Managing medical records
        MedicalRecord recordInPatient = new InPatient("P103", "Alice Brown", 50, 2500, 3);
        recordInPatient.addRecord("Diabetes treatment started.");
        recordInPatient.viewRecords();

        MedicalRecord recordOutPatient = new OutPatient("P104", "Bob White", 28, 700);
        recordOutPatient.addRecord("Routine check-up completed.");
        recordOutPatient.viewRecords();
    }
}
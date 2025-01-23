package Day4.Level1;

import java.util.ArrayList;

// Hospital class (Contains Doctors and Patients)
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

// Doctor class (Associated with multiple Patients)
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }
}

// Patient class (Associated with multiple Doctors)
class Patient {
    private String name;
    private String ailment;
    private ArrayList<Doctor> doctors;

    public Patient(String name,String ailment) {
        this.name = name;
        this.ailment=ailment;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
}

// Main class to demonstrate association and communication
public class HospitalDoctorAndPatients {
    public static void main(String[] args) {
        // Creating hospital
        Hospital hospital = new Hospital("City Hospital");

        // Creating doctors
        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        // Creating patients
        Patient alice = new Patient("Alice","malaria");
        Patient bob = new Patient("Bob","Headache");

        // Adding doctors and patients to hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        // Doctors consulting patients
        drSmith.consult(alice);
        drSmith.consult(bob);
        drJones.consult(alice);

        // Display hospital details
        hospital.displayHospitalDetails();
    }
}

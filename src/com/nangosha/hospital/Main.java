package com.nangosha.hospital;

public class Main {

    public static void main(String[] args){
//    proposed classes
//    medicine class
//    prescription class
//    payment invoice class
//    hospital department
//    hospital (hospital as a whole)
//    report class, maybe an operation report, death report, birth report, diagnostic report etc


//    testing my modules

        Patient patient1 = new Patient("trevor", "nangosha", "Bweyogerere", "single");

        Doctor doctor1 = new Doctor("kelvin", "asea", "gulu", "married");

        Administrator admin1 = new Administrator("geofrey", "khayana", "mbale", "married");

        Nurse nurse1 = new Nurse("mary", "aheebwa", "kampala", "single");

        Accountant accountant1 = new Accountant("eria", "ighadube", "kamuli", "single");

        Medicine medicine1 = new Medicine("CYPHRENUS");

        Prescription prescription1 = new Prescription(medicine1, patient1, 2, 2, 2);

        patient1.viewAppointmentStatus();
        patient1.getAdmissionHistory();
        patient1.viewDoctorList();

        doctor1.createAppointmentWithPatient(patient1);
        doctor1.managePatientAccountOpeningAndUpdating(patient1);
        doctor1.providePatientWithMedication(patient1);

        System.out.println(medicine1.getMedicineDetails());
        medicine1.getAmountInStock();

        prescription1.getPrescriptionDetails();
    }
}

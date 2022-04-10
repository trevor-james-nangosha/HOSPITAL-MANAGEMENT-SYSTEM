package com.nangosha.hospital;

public class Nurse extends Employee{

    Nurse(String myFirstName, String myLastName, String employeeHomeAddress, String employeeMaritalStatus) {
        super(myFirstName, myLastName, employeeHomeAddress, employeeMaritalStatus);
    }

    public void managePatientAccountOpeningAndUpdating(Patient patient){
        System.out.println("i am managing " + patient.firstName + "'s account opening and updating..");
    }

    public void allotBedsToPatients(Patient patient){
        System.out.println("i am allotting " + patient.firstName + "with a bed..");
    }

    public void providePatientWithMedicationAccordingToPrescription(Patient patient, Prescription prescription){
        System.out.println("giving medicine according to prescription..");
    }

    public void manageBloodBankStatus(){
        System.out.println("managing blood bank status..");
    }

    public void keepPatientOperationRecord(Patient patient){
        System.out.println("keeping operation record of.." + patient.firstName);
    }

    public void keepPatientBirthRecord(Patient patient){
        System.out.println("keeping birth record of.." + patient.firstName);
    }

    public void keepPatientDeathRecord(Patient patient){
        System.out.println("keeping death record of.." + patient.firstName);
    }

}

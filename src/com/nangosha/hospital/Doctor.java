package com.nangosha.hospital;

public class Doctor extends Employee{

    Doctor(String myFirstName, String myLastName, String employeeHomeAddress, String employeeMaritalStatus) {
        super(myFirstName, myLastName, employeeHomeAddress, employeeMaritalStatus);
    }

    public void managePatientAccountOpeningAndUpdating(Patient patient){
        System.out.println("managing account opening of " + patient.firstName);
    }

    public void createAppointmentWithPatient(Patient patient){
        System.out.println("Created appointment with " + patient.firstName);
    }

    public void providePatientWithMedication(Patient patient){
        System.out.println("providing medication to " + patient.firstName);
    }

    public void createPatientOperationReport(Patient patient){
        System.out.println("creating patient operation report of  " + patient.firstName);
    }

}

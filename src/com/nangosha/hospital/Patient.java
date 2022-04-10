package com.nangosha.hospital;

import java.util.Date;
public class Patient {

    String lastName;
    String firstName;
    String employeeID;
    String homeAddress;
//    Date dateOfBirth;
    String maritalStatus;

    Patient(String myFirstName, String myLastName, String patientHomeAddress, String patientMaritalStatus){
        this.firstName = myFirstName;
        this.lastName = myLastName;
        this.homeAddress = patientHomeAddress;
        this.maritalStatus = patientMaritalStatus;
    }

    public void viewAppointmentStatus(){
        System.out.println(this.firstName + " is viewing the appointment status......");
    }

    public void viewPrescriptionDetails(){
        System.out.println(this.firstName + " is viewing the prescription details......");
    }

    public void viewDoctorMedication(){
        System.out.println(this.firstName + " is viewing the doctor medication......");
    }

    public void viewDoctorList(){
        System.out.println(this.firstName + " is viewing the doctor list......");
    }

    public void viewBloodBankStatus(){
        System.out.println(this.firstName + " is viewing the blood bank status......");
    }

    public void viewOperationHistory(){
        System.out.println("i am viewing my operation history......");
    }

    public void getAdmissionHistory(){
        System.out.println("i am getting my admission history......");
    }

    public void manageOwnProfile(){
        System.out.println(this.firstName + " is managing their profile");
    }

}

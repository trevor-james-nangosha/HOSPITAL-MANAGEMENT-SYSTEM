package com.nangosha.hospital;

public class Administrator extends Employee {

    Administrator(String myFirstName, String myLastName, String employeeHomeAddress, String employeeMaritalStatus) {
        super(myFirstName, myLastName, employeeHomeAddress, employeeMaritalStatus);
    }

    public void manageHospitalDepartment(Department department){
        System.out.println("managing department called " + department.departmentName);
    }

    public void watchAppointmentOfDoctors(){
        System.out.println("watching appointment of doctors");
    }

    public void watchPatientTransactionReport(Patient patient){
        System.out.println("managing patient transaction report of  " + patient.firstName);
    }

    public void getBedStatus(){
        System.out.println("getting bed status....");
    }

    public void getWardStatus(){
        System.out.println("getting ward status....");
    }

    public void getCabinStatus(){
        System.out.println("getting cabin status....");
    }

    public void watchBloodBankReport(){
        System.out.println("getting blood bank report....");
    }

    public void getHospitalStockLevel(){
        System.out.println("getting hospital stock level....");
    }

    public void getPatientOperationReport(Patient patient){
        System.out.println("getting operation report of " + patient.firstName);
    }

    public void getPatientBirthReport(Patient patient){
        System.out.println("getting birth report of " + patient.firstName);
    }

}

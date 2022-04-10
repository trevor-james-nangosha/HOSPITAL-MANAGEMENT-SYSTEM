package com.nangosha.hospital;

public class LabTechnician extends Employee{

    LabTechnician(String myFirstName, String myLastName, String employeeHomeAddress, String employeeMaritalStatus) {
        super(myFirstName, myLastName, employeeHomeAddress, employeeMaritalStatus);
    }

    public void watchPrescriptionList(){
        System.out.println(" i am watching the prescription list.....");
    }

    public void updateDiagnosticReport(){
        System.out.println(" i am updating the diagnostic report.....");
    }

    public void previewReportFiles(){
        System.out.println(" i am previewing the report files.....");
    }

}

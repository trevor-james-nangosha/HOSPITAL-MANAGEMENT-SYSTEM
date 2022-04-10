package com.nangosha.hospital;

import java.util.Date;

public class Employee {
    String lastName;
    String firstName;
    String employeeID;
    String homeAddress;
//    Date dateOfBirth;
    String maritalStatus;

    Employee(String myFirstName, String myLastName, String employeeHomeAddress, String employeeMaritalStatus){
        this.firstName = myFirstName;
        this.lastName = myLastName;
        this.homeAddress = employeeHomeAddress;
        this.maritalStatus = employeeMaritalStatus;
    }

    void manageOwnProfile(){
        System.out.println("i am managing my profile");
    }
}

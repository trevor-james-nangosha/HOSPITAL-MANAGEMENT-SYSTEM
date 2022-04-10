package com.nangosha.hospital;

public class Accountant extends Employee{
    Accountant(String myFirstName, String myLastName, String employeeHomeAddress, String employeeMaritalStatus) {
        super(myFirstName, myLastName, employeeHomeAddress, employeeMaritalStatus);
    }

    public PaymentInvoice createPaymentInvoice(){
        PaymentInvoice paymentInvoice = new PaymentInvoice();
        return paymentInvoice;
    }

    public void orderInvoiceToPatient(Patient patient){
        System.out.println("Issuing invoice to " + patient.firstName);
    }

    public void takeCashPaymentFromPatient(Patient patient){
        System.out.println("Taking cash payment from " + patient.firstName);
    }

    public void watchPatientPaymentHistory(Patient patient){
        System.out.println("Watching payment history of " + patient.firstName);
    }

}

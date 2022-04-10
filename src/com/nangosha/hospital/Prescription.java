package com.nangosha.hospital;

public class Prescription {
    Medicine medicineBeingPrescribed;
    Patient prescriptionOwner;
    int morningDosage;
    int afternoonDosage;
    int nightDosage;

    Prescription(Medicine theMedicine, Patient thePatient, int theMorningDosage, int theAfternoonDosage, int theNightDosage){
        this.medicineBeingPrescribed = theMedicine;
        this.prescriptionOwner = thePatient;
        this.morningDosage = theMorningDosage;
        this.afternoonDosage = theAfternoonDosage;
        this.nightDosage = theNightDosage;
    };

    public void getPrescriptionDetails(){
        System.out.println("getting the prescription details.....");
    }
}

package com.nangosha.hospital;

public class Medicine {

    String medicineID;
    String medicineName;
    long amountInStock = 0;

    Medicine(String theMedicineName){
        this.medicineName = theMedicineName;
    };

    public void updateAmountInStock(){
        System.out.println("Updating the amount in stock.....");
    }

    public long getAmountInStock(){
        return this.amountInStock;
    }
    public String getMedicineDetails(){
        return "the medicine is called " + this.medicineName;
    }

}

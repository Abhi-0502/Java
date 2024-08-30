package com.xworkz.details.pateint;

import com.xworkz.details.address.Address;

public class Patient {

    Address address;

    public Patient(Address address) {
        this.address = address;
    }

    public void getDetails(){

        this.address.getAdressDetails();


}

}

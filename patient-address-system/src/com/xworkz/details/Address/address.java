package com.xworkz.details.Address;

import com.xworkz.patientdetails.country.Country;

public class Address  {

    Country country;
    public int pId;
    public String pName;

    public Address(Country country){
        this.country=country;

    }

    public void getAdressDetails(){

        System.out.println("patient id is "+this.pId);
        System.out.println("patient name is "+this.pName);
        this.country.getCountryDetails();
}
}
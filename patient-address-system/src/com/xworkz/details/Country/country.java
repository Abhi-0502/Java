package com.xworkz.details.Country;

public class Country {
    State state;
    public String pCountry;


    public Country(State state){
        this.state=state;
    }

    public void getCountryDetails(){
        System.out.println("Patient country is "+this.pCountry);
        this.state.getStateDetails();
    }



}

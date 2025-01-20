package com.xworkz.app.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Patient {


   @Value("shwetha")
    public String name;
   @Value("19")
    public String age;
    @Value("sis")
    public   String disease;

    public Address address ;


    public Patient(Address address){
        this.address      =    address;
    }
    public void getPatientDetailsAndAddress(){
        System.out.println("The name of patient:" +this.name);
        System.out.println("patient age :"+this. age);
        System.out.println("The patient suffering from :"+this.disease);
        this.address.getAddressDetails();
    }
}

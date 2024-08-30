package com.xworkz.details.area;


import com.xworkz.details.Street.Street;

public class Area {

    public String areaName;
    Street street;
    public Area(Street street){
        this.street = street;


    }
    public void getStreetDetails(){
        System.out.println(street.streetId);
        System.out.println(street.streetName);
        System.out.println("The Area Name :"+ this.areaName);
    }
}

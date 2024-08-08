package com.xworkz.hotelmanagement.hotelsystem;

public class HotelSystem {

    public int hotelManagementId;
    public String CustomerName;
    public String CustomerIdproof;

    public void displayDetails(){
        System.out.println("the hotelManagementId is :"+ this.hotelManagementId);
        System.out.println("the CustomerName is :"+ this.CustomerName);
        System.out.println("the CustomerIdproof is :"+ this.CustomerIdproof);
    }
}

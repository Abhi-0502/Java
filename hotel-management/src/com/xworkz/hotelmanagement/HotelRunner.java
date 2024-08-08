package com.xworkz.hotelmanagement;
import com.xworkz.hotelmanagement.hotel.Hotel;
import com.xworkz.hotelmanagement.hotelsystem.HotelSystem;

public class HotelRunner {

    public static void main(String[] args){
        Hotel  HotelSystem  = new Hotel();
        HotelSystem.Roomfees = 5000;

        HotelSystem NoOfrooms = new HotelSystem();
        NoOfrooms.hotelManagementId = 11234;
        NoOfrooms.CustomerName = "abhi";
        NoOfrooms.CustomerIdproof = "pan";

        HotelSystem.allow(NoOfrooms);
    }
}

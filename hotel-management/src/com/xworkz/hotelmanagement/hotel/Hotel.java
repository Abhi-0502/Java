package com.xworkz.hotelmanagement.hotel;

import com.xworkz.hotelmanagement.hotelsystem.HotelSystem;

public class Hotel {

    public int Roomfees;
    public HotelSystem NoOfrooms;

    public boolean allow(HotelSystem productorder){
        boolean isAllowed = false;
        if(Roomfees == 2000){
            System.out.println("the rooom amount is paid");
            if(productorder != null){
                this.NoOfrooms = productorder;
                this.NoOfrooms.displayDetails();
                isAllowed = true;

            }else System.out.println("no roomDetails found");
        }else
            System.out.println("pay the room amount");
        return isAllowed;
    }
}

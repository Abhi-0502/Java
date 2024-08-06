package com.xworkz.Amazon.dao;

import com.xworkz.Amazon.dto.AmazonDto;

public class AmazonDao {
    public void getDetails(AmazonDto abhi) {
        System.out.println("The email is: "+abhi.getEmail());
        System.out.println("The password is: "+abhi.getPassword());
        System.out.println("The phone number is: "+abhi.getPhoneNo());
        System.out.println("The adresss is: "+abhi.getAddresss());
        System.out.println("The user name is: " +abhi.getUserName());
        System.out.println("user Amazon process ended");
    }
}


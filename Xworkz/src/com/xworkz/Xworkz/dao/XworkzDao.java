package com.xworkz.Xworkz.dao;
import com.xworkz.Xworkz.dto.XworkzDto;

public class XworkzDao {
    public void getDetails(XworkzDto abhi) {
        System.out.println("The email is: "+abhi.getEmail());
        System.out.println("The password is: "+abhi.getPassword());
        System.out.println("The phone number is: "+abhi.getPhoneNo());
        System.out.println("The adresss is: "+abhi.getAddresss());
        System.out.println("The user name is: " +abhi.getUserName());
        System.out.println("user Amazon process ended");
    }
}


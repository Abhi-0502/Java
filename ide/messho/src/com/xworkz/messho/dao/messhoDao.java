package com.xworkz.messho.dao;
import com.xworkz.messho.dto.messhoDto;

public class messhoDao {

    messhoDto dto;
    public messhoDao(){
        System.out.println("messho given is information invoke successfully");
    }
    public boolean addmessho(messhoDto dto){
        boolean ismesshoAdded = false;
        boolean isgiveName1 = false;
        boolean isaddress1 = false;
        boolean isphn1 = false;
        boolean isdob1 = false;


        if(dto != null) {
            if (dto.giveName1 != null) {
                this.dto = dto;
                isgiveName1 = true;
            } else
                System.out.println("please enter your valid name");
            if (dto.address1 != null) {
                this.dto = dto;
                isaddress1 = true;
            } else
                System.out.println("plase enter your valid address");
            if (dto.phn1 > 0) {
                this.dto = dto;
                isphn1 = true;

            } else
                System.out.println("please enter your valid phn1");
            if (dto.dob1 != null) {
                this.dto = dto;
                isdob1 = true;
            } else
                System.out.println("please enter your valid dob1");


        }

        else {
            System.out.println("please provide valid information");
            if(isgiveName1 == true && isaddress1 == true){
                this.dto = dto;
                isgiveName1 = true;
            }
        }
        return ismesshoAdded;
    }

    public void getmesshoDetails(){
        System.out.println("messho givenname1 is"+ dto.giveName1);
        System.out.println("messho address is"+ dto.address1);
        System.out.println("messho phn1 is"+ dto.phn1);
        System.out.println("messho dob1 is"+ dto.dob1);

    }

}










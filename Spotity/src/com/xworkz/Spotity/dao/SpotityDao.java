package com.xworkz.Spotity.dao;


import com.xworkz.Spotity.dto.SpotityDto;

public class SpotityDao {

    SpotityDto dto;
    public SpotityDao(){
        System.out.println("spotity given is information invoke successfully");
    }
    public boolean addSpotity(SpotityDto dto){
        boolean isSpotityAdded = false;
        boolean isuserName = false;
        boolean isemail = false;
        boolean isgender = false;
        boolean isdob = false;
        boolean iscountryName = false;

        if(dto != null) {
            if (dto.userName != null) {
                this.dto = dto;
                isuserName = true;
            } else
                System.out.println("please enter your valid spotity userName");
            if (dto.email != null) {
                this.dto = dto;
                isemail = true;
            } else
                System.out.println("plase enter your valid spotity email");
            if (dto.gender != null) {
                this.dto = dto;
                isgender = true;

            } else
                System.out.println("please enter your valid gender");
            if (dto.dob != null) {
                this.dto = dto;
                isdob = true;
            } else
                System.out.println("please enter your valid dob");
            if (dto.countryName != null) {
                this.dto = dto;
                iscountryName = true;
            } else
                System.out.println("please enter your valid countryName");

        }

        else {
            System.out.println("please provide valid information");
            if(isuserName == true && isemail == true){
                this.dto = dto;
                isSpotityAdded = true;
            }
        }
        return isSpotityAdded;
    }

    public void getSpotityDetails(){
        System.out.println("Spotity userName is"+ dto.userName);
        System.out.println("Spotity email is"+ dto.email);
        System.out.println("Spotity gender is"+ dto.gender);
        System.out.println("Spotity dob is"+ dto.dob);
        System.out.println("Spotity countryName"+ dto.countryName);
    }

}
















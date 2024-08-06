package com.xworkz.SunGlass.dao;

import com.xworkz.SunGlass.dto.SunGlassDto;

public class SunGlassDao {


    SunGlassDto dto;
    public SunGlassDao(){
        System.out.println("sunGlass given is information invoke successfully");
    }
    public boolean addSunGlass(SunGlassDto dto){
        boolean isSunGlassAdded = false;
        boolean isname = false;
        boolean istype = false;
        boolean isid = false;
        boolean isprice = false;

        if(dto != null) {
            if (dto.name != null) {
                this.dto = dto;
                isname = true;
            } else
                System.out.println("please enter your valid sunglass name");
            if (dto.type != null) {
                this.dto = dto;
                isid = true;
            } else
                System.out.println("plase enter your valid sunglass id");
            if (dto.id > 0) {
                this.dto = dto;
                istype = true;

            } else
                System.out.println("please enter your valid type");
            if (dto.price > 0) {
                this.dto = dto;
                isprice = true;
            } else
                System.out.println("please enter your valid price");


        }

        else {
            System.out.println("please provide valid information");
            if(isname == true && isid == true){
                this.dto = dto;
                isSunGlassAdded = true;
            }
        }
        return isSunGlassAdded;
    }

    public void getSunGlassDetails(){
        System.out.println("SunGlass userName is"+ dto.name);
        System.out.println("SunGlass email is"+ dto.type);
        System.out.println("SunGlass gender is"+ dto.id);
        System.out.println("SunGlass dob is"+ dto.price);

    }

}
















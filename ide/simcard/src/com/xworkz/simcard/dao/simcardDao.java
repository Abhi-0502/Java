package com.xworkz.simcard.dao;

import com.xworkz.simcard.dto.simcardDto;

public class simcardDao {

    simcardDto dto;
    public simcardDao(){
        System.out.println("simcard given is information invoke successfully");
    }
    public boolean addsimcard(simcardDto dto){
        boolean issimcardAdded = false;
        boolean isname = false;
        boolean isid = false;
        boolean isplan = false;
        boolean isprice = false;


        if(dto != null) {
            if (dto.name != null) {
                this.dto = dto;
                isname = true;
            } else
                System.out.println("please enter your valid name");
            if (dto.id > 0) {
                this.dto = dto;
                isid = true;
            } else
                System.out.println("plase enter your valid id");
            if (dto.plan != null) {
                this.dto = dto;
                isplan = true;

            } else
                System.out.println("please enter your valid plan");
            if (dto.price > 0.0) {
                this.dto = dto;
                isprice = true;
            } else
                System.out.println("please enter your valid price");


        }

        else {
            System.out.println("please provide valid information");
            if(isname == true && isid == true){
                this.dto = dto;
                isname = true;
            }
        }
        return issimcardAdded;
    }

    public void getsimcardDetails(){
        System.out.println("simcard name is"+ dto.name);
        System.out.println("simcard id is"+ dto.id);
        System.out.println("simcard plan is"+ dto.plan);
        System.out.println("simcard price is"+ dto.price);

    }

}










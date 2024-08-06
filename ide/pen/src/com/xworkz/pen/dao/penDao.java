package com.xworkz.pen.dao;

import com.xworkz.pen.dto.penDto;

public class penDao {

    penDto dto;
    public penDao(){
        System.out.println("pen given is information invoke successfully");
    }
    public boolean addpen(penDto dto){
        boolean ispenAdded = false;
        boolean isbrandname = false;
        boolean isid = false;
        boolean iscolor = false;
        boolean isprice = false;


        if(dto != null) {
            if (dto.brandname != null) {
                this.dto = dto;
                isbrandname = true;
            } else
                System.out.println("please enter your valid pen brandName");
            if (dto.id > 0) {
                this.dto = dto;
                isid = true;
            } else
                System.out.println("plase enter your valid pen id");
            if (dto.color != null) {
                this.dto = dto;
                iscolor = true;

            } else
                System.out.println("please enter your valid color");
            if (dto.price > 0.0) {
                this.dto = dto;
                isprice = true;
            } else
                System.out.println("please enter your valid price");

        }

        else {
            System.out.println("please provide valid information");
            if(isbrandname == true && isid == true){
                this.dto = dto;
                ispenAdded = true;
            }
        }
        return ispenAdded;
    }

    public void getpenDetails(){
        System.out.println("pen brandName is"+ dto.brandname);
        System.out.println("pen id is"+ dto.id);
        System.out.println("pen color is"+ dto.color);
        System.out.println("pen price is"+ dto.price);

    }

}










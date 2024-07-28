package com.xworkx.shampoo.dao;


import com.xworkx.shampoo.dto.shampooDto;

public class shampooDao {

     shampooDto dto;
     public shampooDao(){
         System.out.println("shampoo given is information invoke successfully");
     }
     public boolean addshampoo(shampooDto dto){
            boolean isshampooAdded = false;
            boolean isbrandName = false;
            boolean isid = false;
            boolean iscolor = false;
            boolean isprice = false;
            boolean ismgndate = false;
            boolean isexpdate = false;

            if(dto != null) {
                if (dto.brandName != null) {
                    this.dto = dto;
                    isbrandName = true;
                } else
                    System.out.println("please enter your valid shampoo brandName");
                if (dto.id > 0) {
                    this.dto = dto;
                    isid = true;
                } else
                    System.out.println("plase enter your valid shampoo id");
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
                if (dto.mgfDate != null) {
                    this.dto = dto;
                    ismgndate = true;
                } else
                    System.out.println("please enter your valid mgndate");
                if (dto.expDate != null) {
                    this.dto = dto;
                    isexpdate = true;
                } else
                    System.out.println("please enter your valid expdate");
            }

        else {
                    System.out.println("please provide valid information");
                    if(isbrandName == true && isid == true){
                        this.dto = dto;
                        isshampooAdded = true;
                    }
                }
                return isshampooAdded;
            }

            public void getshampooDetails(){
                System.out.println("shampoo brandName is"+ dto.brandName);
                System.out.println("shampoo id is"+ dto.id);
                System.out.println("shampoo color is"+ dto.color);
                System.out.println("shampoo price is"+ dto.price);
                System.out.println("shampoo mgndate"+ dto.mgfDate);
                System.out.println("shampoo expdate is"+ dto.expDate);
            }

        }










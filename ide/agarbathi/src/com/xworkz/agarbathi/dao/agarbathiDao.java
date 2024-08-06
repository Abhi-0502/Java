package com.xworkz.agarbathi.dao;



import com.xworkz.agarbathi.dto.agarbathiDto;

public class agarbathiDao {

    agarbathiDto dto;
    public agarbathiDao(){

        System.out.println("agarbathi given is information invoke successfully");
    }
    public boolean addagarbathi(agarbathiDto dto){
        boolean isagarbathiAdded = false;
        boolean isbrandName = false;
        boolean isid = false;
        boolean isnoOfticks = false;
        boolean isfragrance = false;
        boolean isprice = false;


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
            if (dto.fragrance != null) {
                this.dto = dto;
                isfragrance = true;

            } else
                System.out.println("please enter your valid fragrance");
            if (dto.price > 0.0) {
                this.dto = dto;
                isprice = true;
            } else
                System.out.println("please enter your valid price");
            if (dto.noOfticks >0) {
                this.dto = dto;
                isnoOfticks = true;
            } else
                System.out.println("please enter your valid mgndate");

        }

        else {
            System.out.println("please provide valid information");
            if(isbrandName == true && isid == true){
                this.dto = dto;
                isagarbathiAdded = true;
            }
        }
        return isagarbathiAdded;
    }

    public void getagarbathiDetails(){
        System.out.println("agarbathi brandName is"+ dto.brandName);
        System.out.println("agarbathi id is"+ dto.id);
        System.out.println("agarbathi fragrance is"+ dto.fragrance);
        System.out.println("agarbathi price is"+ dto.price);
        System.out.println("agarbathi noOfticks"+ dto.noOfticks);

    }

}





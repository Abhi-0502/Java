package com.xworkz.NewsPaper.dao;

import com.xworkz.NewsPaper.dto.NewsPaperDto;
public class NewsPaperDao {
    NewsPaperDto dto;
    public NewsPaperDao(){
        System.out.println("NewsPaper given is information invoke successfully");
    }
    public boolean addNewsPaper(NewsPaperDto dto){
        boolean isNewsPaperAdded = false;
        boolean iscompanyName = false;
        boolean isnoOfPages = false;
        boolean islanguage = false;
        boolean isprice = false;
        if(dto != null){
            if(dto.companyName != null) {
                this.dto = dto;
                iscompanyName = true;
            }
            else
                System.out.println("please enter your valid newspaper companyname");
            if(dto.noOfPages > 0){
                this.dto = dto;
                isnoOfPages= true;
            }
            else
                System.out.println("plase enter your valid stock noOfPages");
            if(dto.language != null){
                this.dto = dto;
                iscompanyName = true;

            }
            else
                System.out.println("please enter your valid language");
            if(dto.price > 0.0){
                this.dto = dto;
                iscompanyName = true;
            }
            else
                System.out.println("please enter your valid price");

        }
        else {
            System.out.println("please provide valid information");
            if(iscompanyName == true && isnoOfPages == true){
                this.dto = dto;
                isNewsPaperAdded = true;
            }
        }
        return isNewsPaperAdded;
    }

public void getNewsPaperDetails(){
    System.out.println("newspaper companyName is"+ dto.companyName);
    System.out.println("newspaper noOfPages is"+ dto.noOfPages);
    System.out.println("newspaper language is"+ dto.language);
    System.out.println("newspaper price is"+ dto.price);
}

}

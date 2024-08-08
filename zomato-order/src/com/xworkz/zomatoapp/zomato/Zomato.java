package com.xworkz.zomatoapp.zomato;

import com.xworkz.zomatoapp.zomatofood.ZomatoFood;

public class Zomato {

    public int orderfees;
    public ZomatoFood food;

    public boolean allow(ZomatoFood food){
        boolean isAllowed = false;
        if(orderfees == 1000){
            System.out.println("food order amount is paied");
            if(food != null){
                this.food = food;
                this.food.displayDetails();
                isAllowed = true;
                System.out.println("foodorder is issued");
            }else System.out.println("no of Food is found");

        }else
            System.out.println("first pay the food amount");
        return isAllowed;
    }
}

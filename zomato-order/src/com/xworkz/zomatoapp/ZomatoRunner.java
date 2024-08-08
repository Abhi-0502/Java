package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.zomato.Zomato;
import com.xworkz.zomatoapp.zomatofood.ZomatoFood;

public class ZomatoRunner {

    public static void  main(String[] args){
        Zomato zomato = new Zomato();
        zomato.orderfees = 1000;

        ZomatoFood food = new ZomatoFood();
        food.orderfees = 1;
        food.panir = "2";
        food.Dose = "3";
        food.Nonveg = "4";

        zomato.allow(food);

    }
}

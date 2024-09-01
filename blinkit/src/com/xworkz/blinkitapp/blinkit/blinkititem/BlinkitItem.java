package com.xworkz.blinkitapp.blinkit.blinkititem;

import com.xworkz.blinkitapp.blinkit.Blinkit;

public class BlinkitItem {

    public int blinkitId;
    public String blinkitName;
    public String blinkitType;
    public String Quality;
    public double price;
    public Blinkit BlinkitItem;

    public BlinkitItem(int blinkitId, String blinkitName, String blinkitType, String Quality, double price){
        System.out.println("main started");
        this.blinkitId = blinkitId;
        this.blinkitName = blinkitName;
        this.blinkitType = blinkitType;
        this.Quality = Quality;
        this.price = price;

    }
    public void getBlinkitItemDetails () {
        System.out.println("blinkit Id is :" + blinkitId);
        System.out.println("blinkit name is :" + blinkitName);
        System.out.println("blinkit type is :" + blinkitType);
        System.out.println("Quality is :" + Quality);
        this.BlinkitItem.getBlinkitItemDetails();
    }

}

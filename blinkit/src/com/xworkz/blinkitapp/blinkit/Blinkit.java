package com.xworkz.blinkitapp.blinkit;

import com.xworkz.blinkitapp.blinkit.blinkititem.BlinkitItem;

public class Blinkit {

    public int blinkitId;
    public String blinkitName;
    public Blinkit BlinkitItem;

    public Blinkit(int blinkitId, String blinkitName, String blinkitType, double price,Blinkit Blinkit)
    {

            System.out.println(" main started");
            this.blinkitId = blinkitId;
            this.blinkitName = blinkitName;
        }
        public void getBlinkitItemDetails(){
            System.out.println("blinkit Id is :" + blinkitId);
            System.out.println("blinkitName is :" + blinkitName);
            this.BlinkitItem.getBlinkitItemDetails();
        }
    }


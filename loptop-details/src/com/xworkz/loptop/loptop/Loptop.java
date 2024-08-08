package com.xworkz.loptop.loptop;

import com.xworkz.loptop.loptopdetails.LoptopDetails;

public class Loptop {

    public int loptopfees;
    public LoptopDetails newloptop;



    public boolean allow(LoptopDetails newloptop){
        boolean isAllowed = false;
        if(loptopfees == 2000){
            System.out.println("the newloptop amount is paid");
            if(newloptop != null){
                this.newloptop = newloptop;
                this.newloptop.displayDetails();
                isAllowed = true;

            }else System.out.println("no loptopDetails found");
        }else
            System.out.println("pay the product amount");
        return isAllowed;
    }
}

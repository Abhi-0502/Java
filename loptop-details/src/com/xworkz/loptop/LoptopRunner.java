package com.xworkz.loptop;

import com.xworkz.loptop.loptop.Loptop;
import com.xworkz.loptop.loptopdetails.LoptopDetails;

public class LoptopRunner {


    public static void main(String[] args){
        Loptop LoptopDetails = new Loptop();
        LoptopDetails.loptopfees = 5000;

      LoptopDetails newloptop = new LoptopDetails();
        newloptop.loptopId = 1234567;
        newloptop.loptopacer = "55000";
        newloptop.loptopdel = "50000";


        LoptopDetails.allow(newloptop);
    }
}



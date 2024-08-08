package com.xworkz;

import com.xworkz.madgoexpress.MadgoExpress;
import com.xworkz.rajdaniexpress.RajdaniExpress;
import com.xworkz.train.Train;
import com.xworkz.vandhebharath.VandheBharath;

public class TrainRunner {
    public static void main(String[] args) {
        System.out.println("main stared");

        Train vandheBharath = new VandheBharath();      //polymorphisum
        vandheBharath.transport();

        Train madgoExpress = new MadgoExpress();
        madgoExpress.transport();

        RajdaniExpress rajdaniExpress = new RajdaniExpress();
        rajdaniExpress.transport();





        System.out.println("main ended");

    }
}

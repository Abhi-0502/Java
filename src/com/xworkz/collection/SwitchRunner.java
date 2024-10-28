package com.xworkz.collection;

public class SwitchRunner {

    public static void main(String[] args) {
        Switch aswitch = () ->{
            System.out.println("Tubelight is turned on");
            return true;
        };
        aswitch.on();
    }
}

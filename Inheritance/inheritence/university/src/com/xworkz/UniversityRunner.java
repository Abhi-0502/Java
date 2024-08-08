package com.xworkz;

import com.xworkz.nalanda.Nalanda;
import com.xworkz.standford.StandsFord;
import com.xworkz.takshashila.Takshashila;
import com.xworkz.university.University;
import com.xworkz.vikramashila.Vikramashila;

public class UniversityRunner {
    public static void main(String[] args) {
        System.out.println("main method started");

        University nalanda = new Nalanda();//polymorphism
        nalanda.bussiness();

        University standsFord = new StandsFord();
        standsFord.bussiness();

        Takshashila takshashila=new Takshashila();
        takshashila.bussiness();

        Vikramashila vikramashila = new Vikramashila();
        vikramashila.bussiness();


        System.out.println("main method ended");
    }
}

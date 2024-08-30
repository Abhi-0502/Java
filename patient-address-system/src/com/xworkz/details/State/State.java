package com.xworkz.details.State;

public class State {
    public String stateName;
    City city;
    public State(City city){
        this.city = city;}

     public void getCityDetails(){
        this.city.getAreaDetails();
         System.out.println("State Name = "+ this.stateName);
     }


}

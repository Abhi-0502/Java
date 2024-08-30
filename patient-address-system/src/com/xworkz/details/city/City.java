package com.xworkz.details.city;

public class City {
   public String cityName;

   Area area;

   public city(Area area){
       this.area = area;

   }
   public void getAreaDetails(){
       this.area.getStreetDetails();
       System.out.println("city Name :"+ this.cityName);
   }
}

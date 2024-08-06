package com.xworkz.growapp.dao;

import com.xworkz.growapp.dto.GrowStockDto;

public class GrowStockDao {

   GrowStockDto dto;
   public GrowStockDao(){
       System.out.println("Grow stock invoke successfully");
   }
    public boolean addGrowStock(GrowStockDto dto){
       boolean isGrowStockAdded = false;
       boolean isStockName = false;
       boolean isStockRefId = false;
       boolean isDate = false;
       if(dto != null){
           if(dto.getstockName() != null ) {
               this.dto = dto;
               isStockName = true;
           }
           else
               System.out.println("please enter your valid stock name");
           if(dto.getStockRefId() > 0){
               System.out.println(dto.getStockRefId() > 0);
               this.dto = dto;
               isStockName = true;
           }
           else
               System.out.println("plase enter your valid stock id");

           if(dto.getstockPrice() > 0.0){
               System.out.println(dto.getstockPrice()>0.0);
               this.dto = dto;
               isStockName = true;

           }
           else
               System.out.println("please enter your valid price");
           if(dto.getnoOfStocks() > 0.0){
               System.out.println(dto.getnoOfStocks() > 0.0);
               this.dto = dto;
               isStockName = true;
           }
           else
               System.out.println("please enter your valid noOfStocks");
           if(dto.getdate() != null){
               this.dto = dto;
               isDate = true;
           }
           else
               System.out.println("please enter your valid date ");
       }
       else {
           System.out.println("please provide valid information");
           if(isStockName == true && isStockRefId == true){
               this.dto = dto;
               isGrowStockAdded = true;
           }
       }
       return isGrowStockAdded;
    }



    public void getGrowStockDetails() {
        System.out.println("stock ref id"+ dto.getStockRefId());
        System.out.println("stock Name"+ dto.getstockName());
        System.out.println("stock price"+ dto.getstockPrice());
        System.out.println("stock date"+ dto.getdate());
    }
    
}

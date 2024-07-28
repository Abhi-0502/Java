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
           if(dto.stockName != null) {
               this.dto = dto;
               isStockName = true;
           }
           else
               System.out.println("please enter your valid stock name");
           if(dto.stockRefId > 0){
               this.dto = dto;
               isStockName = true;
           }
           else
               System.out.println("plase enter your valid stock id");
           if(dto.stockPrice > 0.0){
               this.dto = dto;
               isStockName = true;

           }
           else
               System.out.println("please enter your valid price");
           if(dto.noOfStocks > 0.0){
               this.dto = dto;
               isStockName = true;
           }
           else
               System.out.println("please enter your valid noOfStocks");
           if(dto.date != null){
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
        System.out.println("stock ref id"+ dto.stockName);
        System.out.println("stock Name"+ dto.stockName);
        System.out.println("stock price"+ dto.stockPrice);
        System.out.println("stock date"+ dto.date);
    }
}

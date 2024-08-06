package com.xworkz.growapp.dto;



public class GrowStockDto {

    private int stockRefId;
    private String stockName;
    private double stockPrice;
    private String date;
    private int noOfStocks;

    public GrowStockDto(){

    }

    public int getStockRefId(){
        return stockRefId;
    }
    public String getstockName(){
        return stockName;
    }
    public double getstockPrice(){
        return stockPrice;
    }
    public String getdate(){
        return date;
    }
    public int getnoOfStocks(){
        return noOfStocks;
    }

public GrowStockDto(int stockRefId,String stockName,double stockPrice,String date,int noOfStocks){
        this.stockRefId = stockRefId;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.date = date;
        this.noOfStocks = noOfStocks;
}
}

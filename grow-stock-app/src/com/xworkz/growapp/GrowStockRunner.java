package com.xworkz.growapp;

import com.xworkz.growapp.dao.GrowStockDao;
import com.xworkz.growapp.dto.GrowStockDto;

  public class GrowStockRunner {

    public static void main(String[] args) {
        GrowStockDao growStockDao = new GrowStockDao();

        GrowStockDto growStockDto = new GrowStockDto();
        growStockDto.stockName = "Ey";
        growStockDto.stockRefId = 2345678;
        growStockDto.stockPrice = 250.00;
        growStockDto.noOfStocks = 5;
        growStockDto.date = "05/07/2001";
        growStockDao.addGrowStock(growStockDto);
        growStockDao.getGrowStockDetails();

    }


  }

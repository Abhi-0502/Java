package com.xworkz.growapp;

import com.xworkz.growapp.dao.GrowStockDao;
import com.xworkz.growapp.dto.GrowStockDto;

  public class GrowStockRunner {

    public static void main(String[] args) {
        GrowStockDao growStockDao = new GrowStockDao();

        GrowStockDto growStockDto = new GrowStockDto(2345678,"Ey",250.0,"05/07/2002",5);

        growStockDao.addGrowStock(growStockDto);
        growStockDao.getGrowStockDetails();

    }


  }

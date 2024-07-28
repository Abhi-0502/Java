package com.xworkz.NewsPaper;


import com.xworkz.NewsPaper.dao.NewsPaperDao;
import com.xworkz.NewsPaper.dto.NewsPaperDto;


public class NewsPaperRunner {

    public static void main(String[] args) {
        NewsPaperDao newsPaperDao = new NewsPaperDao();
        NewsPaperDto newsPaperDto = new NewsPaperDto();

        newsPaperDto.companyName = "Insight Outlet";
        newsPaperDto.noOfPages = 10;
        newsPaperDto.language = "English";
        newsPaperDto.price = 10;
        newsPaperDao.addNewsPaper(newsPaperDto);
        newsPaperDao.getNewsPaperDetails();
    }
    }
















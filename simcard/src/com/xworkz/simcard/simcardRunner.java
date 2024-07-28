package com.xworkz.simcard;

import com.xworkz.simcard.dao.simcardDao;
import com.xworkz.simcard.dto.simcardDto;

public class simcardRunner {


    public static void main(String[] args) {
        simcardDao simcardDao = new simcardDao();
        simcardDto simcardDto = new simcardDto();

        simcardDto.name = "Airtel";
        simcardDto.id = 1;
        simcardDto.plan = "365 days";
        simcardDto.price = 3000;

        simcardDao.addsimcard(simcardDto);

        simcardDao.getsimcardDetails();


    }
}



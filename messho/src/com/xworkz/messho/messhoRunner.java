package com.xworkz.messho;


import com.xworkz.messho.dao.messhoDao;
import com.xworkz.messho.dto.messhoDto;

public class messhoRunner {


    public static void main(String[] args) {
        messhoDao messhoDao = new messhoDao();
        messhoDto messhoDto = new messhoDto();

        messhoDto.giveName1 = "abhi";
        messhoDto.address1 = "Mysore";
        messhoDto.phn1 = 2345678;
        messhoDto.dob1 = "02/11/2001";

        messhoDao.addmessho(messhoDto);

        messhoDao.getmesshoDetails();


    }
}



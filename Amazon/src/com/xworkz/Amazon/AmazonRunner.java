package com.xworkz.Amazon;

import com.xworkz.Amazon.dao.AmazonDao;
import com.xworkz.Amazon.dto.AmazonDto;

public class AmazonRunner {
    public static void main(String args[]) {
        AmazonDto amazonDto=new AmazonDto();
        amazonDto.setEmail("abhi0502@gmail.com");
        amazonDto.setPassword("12345");
        amazonDto.setPhoneNo("7204726");
        amazonDto.setAddresss("Mysore");
        amazonDto.setUserName("abhi");

        AmazonDao amazonDao=new AmazonDao();
        //amazonDao.createAmazonAccount(amazonDto);
        amazonDao.getDetails(amazonDto);
    }
}

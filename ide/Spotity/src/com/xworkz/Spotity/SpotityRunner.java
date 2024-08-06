package com.xworkz.Spotity;


import com.xworkz.Spotity.dao.SpotityDao;
import com.xworkz.Spotity.dto.SpotityDto;

public class SpotityRunner {


    public static void main(String[] args) {
        SpotityDao SpotityDao = new SpotityDao();
        SpotityDto SpotityDto = new SpotityDto();

        SpotityDto.userName = "MA";
        SpotityDto.email = "abhi@123";
        SpotityDto.gender = "female";
        SpotityDto.dob = "05/ 07/2001";
        SpotityDto.countryName = "India";


        SpotityDao.addSpotity(SpotityDto);

        SpotityDao.getSpotityDetails();

    }
}

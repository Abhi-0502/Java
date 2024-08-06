package com.xworkz.SunGlass;


import com.xworkz.SunGlass.dao.SunGlassDao;
import com.xworkz.SunGlass.dto.SunGlassDto;
public class SunGlassRunner {


        public static void main(String[] args) {
            SunGlassDao SunGlassDao = new SunGlassDao();
            SunGlassDto SunGlassDto = new SunGlassDto();

            SunGlassDto.name = "MA";
            SunGlassDto.type = "abhi@123";
            SunGlassDto.id = 10;
            SunGlassDto.price = 100;


            SunGlassDao.addSunGlass(SunGlassDto);

            SunGlassDao.getSunGlassDetails();

        }
    }

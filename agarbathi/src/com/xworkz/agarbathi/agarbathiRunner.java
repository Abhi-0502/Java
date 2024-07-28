package com.xworkz.agarbathi;

import com.xworkz.agarbathi.dao.agarbathiDao;
import com.xworkz.agarbathi.dto.agarbathiDto;
public class agarbathiRunner {

    public static void main(String[] args){
        agarbathiDto dto = new agarbathiDto();
        dto.noOfticks = 10;
        dto.brandName = "Mangaldeep";
        dto.id = 1;

        agarbathiDao agarbathiDao = new agarbathiDao();
        agarbathiDao.addagarbathi(dto);
        agarbathiDao.getagarbathiDetails();

    }
}

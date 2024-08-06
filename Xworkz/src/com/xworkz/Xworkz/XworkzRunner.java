package com.xworkz.Xworkz;

import com.xworkz.Xworkz.dao.XworkzDao;
import com.xworkz.Xworkz.dto.XworkzDto;

public class XworkzRunner {
    public static void main(String args[]) {
        XworkzDto XworkzDto=new XworkzDto();
        XworkzDto.setEmail("abhi0502@gmail.com");
        XworkzDto.setPassword("12345");
        XworkzDto.setPhoneNo("7204726");
        XworkzDto.setAddresss("Mysore");
        XworkzDto.setUserName("abhi");

        XworkzDao XworkzDao=new XworkzDao();
        //XworkzDao.createAmazonAccount(XworkzDto);
        XworkzDao.getDetails(XworkzDto);
    }
}

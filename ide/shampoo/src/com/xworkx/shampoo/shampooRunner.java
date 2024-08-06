package com.xworkx.shampoo;

import com.xworkx.shampoo.dao.shampooDao;
import com.xworkx.shampoo.dto.shampooDto;

public class shampooRunner {


    public static void main(String[] args) {
        shampooDao shampooDao = new shampooDao();
        shampooDto shampooDto = new shampooDto();

        shampooDto.brandName = "sunsilk";
        shampooDto.id = 12;
        shampooDto.color = "blue";
        shampooDto.price = 10;
        shampooDto.mgfDate = "12/05/24";
        shampooDto.expDate = "11/05/25";

        shampooDao.addshampoo(shampooDto);

        shampooDao.getshampooDetails();


    }
}



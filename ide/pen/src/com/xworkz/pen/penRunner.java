package com.xworkz.pen;


import com.xworkz.pen.dao.penDao;
import com.xworkz.pen.dto.penDto;

public class penRunner {

    public static void main(String[] args){
        penDto dto = new penDto();

        dto.brandname = "Reynolods";
        dto.id = 1;
        dto.color = "pink";
        dto.price = 10.00;
        System.out.println("The Brand name is "+ dto.brandname);
        System.out.println("The color is "+ dto.color);

        penDao penDao = new penDao();
        penDao.addpen(dto);
        penDao. getpenDetails();
    }
}

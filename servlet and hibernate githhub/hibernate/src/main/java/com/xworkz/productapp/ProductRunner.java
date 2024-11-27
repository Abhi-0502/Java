package com.xworkz.productapp;

import com.xworkz.productapp.dao.EcomerceDaoImpl;
import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.EcommerceService;
import com.xworkz.productapp.service.ServiceImpl;

import javax.security.auth.login.Configuration;

public class ProductRunner {

    public static void main(String[] args) {

        ProductDto productDto = new ProductDto();
        productDto.setProductId(9);
        productDto.setProductName("Mobile");
        productDto.setProductCategory("Electronic");
        productDto.setPrice(30000);
        productDto.setRatings("4.0");
       ProductDto productDto2 = new ProductDto();
        productDto2.setProductId(10);
        productDto2.setProductName("phone");
        productDto2.setProductCategory("Electronic");
        productDto2.setPrice(200);
        productDto2.setRatings("4.0");


        EcommerceDao ecommerceDao = new EcomerceDaoImpl();
        EcommerceService ecommerceService = new ServiceImpl();
     //  ecommerceService.validateAndSaveProduct(productDto);
       // ecommerceService.validateAndSaveProduct(productDto2);
       ProductDto dto = ecommerceService.getProductById(7);
       System.out.println(dto);
        ProductDto dto1= ecommerceService.update(9);
        System.out.println(dto1);


    }
}

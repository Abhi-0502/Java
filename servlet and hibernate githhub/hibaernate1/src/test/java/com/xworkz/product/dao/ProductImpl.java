package com.xworkz.product.dao;

import com.xworkz.product.dtoentity.ProductDto;

public class ProductImpl implements Product{

    @Override
    public void addProduct(ProductDto dto) {

        dto.setId(8);
        dto.setPrice(1000);
        dto.setCategory("Paincular");
        dto.setProductName("Paracitomal");
        dto.setRatings(4.1);

    }
}
package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;


public interface EcommerceDao {

    boolean addProduct(ProductDto productDto);
    public ProductDto getProductById(int productID);
    public ProductDto update(int productId );



}

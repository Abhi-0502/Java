package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;
import org.hibernate.sql.Update;

public interface EcommerceService {

   boolean validateAndSaveProduct(ProductDto dto);
   public ProductDto getProductById(int productID);
   public ProductDto update(int productId);
}

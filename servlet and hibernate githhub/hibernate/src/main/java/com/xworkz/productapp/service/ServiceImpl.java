package com.xworkz.productapp.service;

import com.xworkz.productapp.dao.EcomerceDaoImpl;
import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;

public class ServiceImpl implements EcommerceService {

    EcommerceDao ecommerceDao = new EcomerceDaoImpl();

    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {
        boolean productNameValid = false;
        boolean productCategoryValid = false;
        boolean productstored =  false;
        if (dto != null) {
            if (dto.getProductName() != null && !dto.getProductName().isEmpty()) {
                System.out.println("Product Name Validated!!....");
                productNameValid = true;
            }
            if (dto.getProductCategory() != null && !dto.getProductCategory().isEmpty()) {
                System.out.println("Product Category Validate!!.....");
                productCategoryValid = true;
            }
        }
            if (productNameValid == true && productCategoryValid == true){
                productstored = ecommerceDao.addProduct(dto);
        }

return productstored;

    }

    @Override
    public ProductDto getProductById(int productID) {
        if(productID > 0){
            System.out.println("get the details of productid");
            return ecommerceDao.getProductById(productID);
        }
        return null;
    }

    @Override
    public ProductDto update(int productId) {
        if (productId > 0){
            System.out.println("update the id");
            return ecommerceDao.update(productId);
        }
        return null;
    }
}

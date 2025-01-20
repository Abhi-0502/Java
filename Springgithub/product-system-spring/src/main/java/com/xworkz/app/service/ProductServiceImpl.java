package com.xworkz.app.service;

import com.xworkz.app.dao.ProductDao;
import com.xworkz.app.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService{

     @Autowired
       private ProductDao productDao;

    @Override
    public boolean validateAndSave(ProductDto productDto) {
        boolean productValid = false;
        boolean isProductNameValid = false;
        if(productDto != null){
            if(productDto.getProductName() != null  && !productDto.getProductName().isEmpty()){
                isProductNameValid = true;
            }
            if(isProductNameValid){
                productValid = productDao.save(productDto);
            }
        }
        return productValid;
    }

    @Override
    public void UpdateProductId(int id,ProductDto productDto) {
        productDao.UpdateProductId(id,productDto);

    }

    @Override
    public boolean deleteProductId(int id) {
        if (id > 0){
            System.out.println("deleteUser by id");
        }
        return productDao.deleteProductId(id);
    }

    @Override
    public ProductDto getUserById(int id) {
        return  productDao.getUserById(id);
    }

    @Override
    public List<ProductDto> getAllDetails(ProductDto productDto) {
       return productDao.getAllDetails(productDto);
    }

    @Override
    public String getUserNameById(int id) {
        String userName = null;
        if(id > 0){
            userName= productDao.getUserNameById(id);
        }
        return userName;
    }

    @Override
    public Object[] getUserNameAndcategoryById(int id) {
        Object object[] = null;
        if (id>0){
            object = productDao.getUserNameAndcategoryById(id);
        }
        return object;
    }

    @Override
    public Object[] getcategoryAndproductNoById(int id) {
        Object object[] = null;
        if (id>0){
            object = productDao.getcategoryAndproductNoById(id);
        }
        return object;
    }

    @Override
    public String getproductNoById(int id) {
        String productNo = null;
        if(id > 0){
            productNo= productDao.getproductNoById(id);
        }
        return productNo;
    }

    @Override
    public String getCategoryById(int id) {
        String category = null;
        if(id > 0){
            category= productDao.getCategoryById(id);
        }
        return category;
    }
}

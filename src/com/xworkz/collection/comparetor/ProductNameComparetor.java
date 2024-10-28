package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.ProductDto;

import java.util.Comparator;

public class ProductNameComparetor implements Comparator<ProductDto> {
    @Override
    public int compare(ProductDto o1, ProductDto o2) {

        return o1.getProductName().compareTo(o2.getProductName());
    }
}

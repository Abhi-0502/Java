package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.ProductDto;

import java.util.Comparator;

public class RatingsComparetor implements Comparator<ProductDto> {

    @Override
    public int compare(ProductDto o1, ProductDto o2) {
     return (int) (o1.getRatings() - o2.getRatings());

    }
}

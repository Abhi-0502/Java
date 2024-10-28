package com.xworkz.collection.dto;

import com.xworkz.collection.comparetor.PriceComparetor;
import com.xworkz.collection.comparetor.ProductNameComparetor;
import com.xworkz.collection.comparetor.RatingsComparetor;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class ProductDtoRunner extends Object {


    public static void main(String[] args) {

       // Collection<ProductDto> collection = new ArrayList<>();
       List<ProductDto> collection = new ArrayList<>();
        ProductDto dto1 = new ProductDto(1,"power bank",600.0,"Electronics",4.5);
        ProductDto dto2 = new ProductDto(2,"Mobile",10000.0,"Electronic device",4.9);
        ProductDto dto3 = new ProductDto(3,"Firework Chocolate",529,"Firework",3.6);
        ProductDto dto4 = new ProductDto(4,"Bulb",100,"electronics",4.7);
        ProductDto dto5 = new ProductDto(5,"Bag",200.0,"carry bag",4.0);

        collection.add(dto1);  
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);

       // collection.sort(new ProductDto());

      //  collection.sort(new PriceComparetor());
       // collection.sort(new ProductNameComparetor());
       // collection.sort(new RatingsComparetor());
        Collections.sort(collection);
   // System.out.println(collection.stream().sorted(Comparator.comparing(ProductDto::getProductName).reversed()).collect(Collectors.toList()));
        System.out.println(" Stream get started");
       // System.out.println(collection.stream().sorted(Comparator.comparing(ProductDto::getPrice).thenComparing(ProductDto::getProductName)).collect(Collectors.toList()));

        System.out.println(collection.stream().sorted(Comparator.comparing(ProductDto::getPrice).reversed()).findFirst());
       // Collections.sort(collection,new ProductNameComparetor());
      //  Collections.sort(collection,new PriceComparetor());
     //  Collections.sort(collection,new RatingsComparetor());



        //retrive /fetch/proces
       for (ProductDto product : collection){
            System.out.println(product);
        }


    }
}


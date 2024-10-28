package com.xworkz.collection.dto;


import lombok.*;

import java.util.Comparator;


@Getter
   @Setter
   @NoArgsConstructor
   @ToString
  @AllArgsConstructor
public class ProductDto implements Comparable<ProductDto>{
        //Comparator<ProductDto>

   private int productid;
   private String ProductName;
   private double price;
   private String type;
    private double Ratings;



   /* @Override
    public int compare(ProductDto o1, ProductDto o2) {
        System.out.println(o1.productid + " " + o2.productid);
       // return o1.productid - o2.productid;
        int diff = o1.productid - o2.productid;
        System.out.println(diff);
        return diff;
    }*/

    @Override
    public int compareTo(ProductDto o) {

       System.out.println(this.productid + " " + o.productid);
       return this.productid-o.productid;
    }
}

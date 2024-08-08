package com.xworkz.amazonapp.Amazon;

import com.xworkz.amazonapp.AmazonProduct.Amazonproduct;

public class amazon {

    public int productfees;
    public Amazonproduct productorder;

    public boolean allow(Amazonproduct productorder){
        boolean isAllowed = false;
        if(productfees == 2000){
            System.out.println("the product amount is paid");
            if(productorder != null){
                this.productorder = productorder;
                this.productorder.displayDetails();
                isAllowed = true;

            }else System.out.println("no productDetails found");
        }else
            System.out.println("pay the product amount");
        return isAllowed;
    }
}

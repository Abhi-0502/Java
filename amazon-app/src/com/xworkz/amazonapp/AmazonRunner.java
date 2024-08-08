package com.xworkz.amazonapp;
import com.xworkz.amazonapp.Amazon.amazon;
import com.xworkz.amazonapp.AmazonProduct.Amazonproduct;

public class AmazonRunner {

    public static void main(String[] args){
        amazon Amazonproduct = new amazon();
        Amazonproduct.productfees = 5000;

        Amazonproduct productorder = new Amazonproduct();
        productorder.ElectricalId = 1234567;
        productorder.Mobile = "15000";
        productorder.sandels = "500";
        productorder.Instruments = "1000";

        Amazonproduct.allow(productorder);
    }
}

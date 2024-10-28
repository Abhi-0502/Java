package com.xworkz.productdetails.product;

import com.xworkz.productdetails.customer.Customer;

public interface Product {
    boolean addCustomer(Customer customer)
    void getAllCustomer();
    Customer getCustomerById(int id);
    Customer getCustomerByEmail(String email);
}



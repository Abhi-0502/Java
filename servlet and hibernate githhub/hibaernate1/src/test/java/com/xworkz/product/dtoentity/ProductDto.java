package com.xworkz.product.dtoentity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name ="product_details")
public class ProductDto {


    @Id
    @Column(name="id")
    private int id;

    @Column(name="price")
    private double price;

    @Column(name="category")
    private String category;

    @Column(name="product_name")
    private String productName;

    @Column(name="ratings")
    private double ratings;
}


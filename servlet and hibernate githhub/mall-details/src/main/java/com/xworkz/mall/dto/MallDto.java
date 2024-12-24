package com.xworkz.mall.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "mall_details")
public class MallDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mall_id")
    private int id;
    @Column(name = "mall_name")
    private String mallName;
    @Column(name = "mall_area")
    private String mallArea;
    @Column(name = "mall_noOfFloors")
    private int noOfFloors;
    @Column(name = "mall_city")
    private String city;
}

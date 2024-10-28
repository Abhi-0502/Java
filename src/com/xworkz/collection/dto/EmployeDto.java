package com.xworkz.collection.dto;

import lombok.*;

import java.util.Comparator;


@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class EmployeDto implements Comparator<EmployeDto> {

    private int id;
    private String EmployeName;
    private String Department;
    private double EmployeSalary;


    @Override
    public int compare(EmployeDto o1, EmployeDto o2) {
        return 0;
    }
}

package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.EmployeDto;

import java.util.Comparator;

public class EmployeSalary implements Comparator<EmployeDto> {
    @Override
    public int compare(EmployeDto o1, EmployeDto o2) {
        System.out.println(o1.getEmployeSalary() + " " + o2.getEmployeSalary());
        return (int) (o1.getEmployeSalary()- o2.getEmployeSalary());
    }
}

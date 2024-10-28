package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.EmployeDto;

import java.util.Comparator;

public class EmployeDep implements Comparator<EmployeDto> {

    @Override
    public int compare(EmployeDto o1, EmployeDto o2) {
        System.out.println(o1.getDepartment() + " " + o2.getDepartment());
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}

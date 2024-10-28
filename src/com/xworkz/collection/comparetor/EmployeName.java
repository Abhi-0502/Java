package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.EmployeDto;

import java.util.Comparator;

public class EmployeName implements Comparator<EmployeDto> {
    @Override
    public int compare(EmployeDto o1, EmployeDto o2) {
        System.out.println(o1.getEmployeName() + " " + o2.getEmployeName());
        return o1.getEmployeName().compareTo(o2.getEmployeName());
    }
}

package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.EmployeDto;

import java.util.Comparator;

public class EmployeId implements Comparator<EmployeDto> {
    @Override
    public int compare(EmployeDto o1, EmployeDto o2) {
        System.out.println(o1.getId() + " " + o2.getId());
        return o1.getId() - o2.getId();
    }
}

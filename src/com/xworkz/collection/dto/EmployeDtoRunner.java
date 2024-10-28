package com.xworkz.collection.dto;

import com.xworkz.collection.comparetor.EmployeDep;
import com.xworkz.collection.comparetor.EmployeId;
import com.xworkz.collection.comparetor.EmployeName;
import com.xworkz.collection.comparetor.EmployeSalary;

import java.util.ArrayList;
import java.util.List;

public class EmployeDtoRunner {

    public static void main(String[] args) {

        List<EmployeDto> collection = new ArrayList<>();

       EmployeDto dto1 = new EmployeDto(1,"vaisu","cs",50000);
        EmployeDto dto2 = new EmployeDto(2,"Neha","Ec",70000);
        EmployeDto dto3 = new EmployeDto(3,"Manya","ME",60000);
        EmployeDto dto4 = new EmployeDto(4,"Nayana","EEE",30000);
        EmployeDto dto5 = new EmployeDto(5,"Sanjana","cs",40000);
        EmployeDto dto6 = new EmployeDto(6,"Maha","Ec",40000);
        EmployeDto dto7 = new EmployeDto(7,"pooja","cs",60000);
        EmployeDto dto8 = new EmployeDto(8,"priya","Cvill",40000);
        EmployeDto dto9 = new EmployeDto(9,"Anu","MCA",70000);

        collection.add(dto1);
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);
        collection.add(dto6);
        collection.add(dto7);
        collection.add(dto8);
        collection.add(dto9);

        collection.sort(new EmployeDto());
        collection.sort(new EmployeId());
        collection.sort(new EmployeName());
        collection.sort(new EmployeDep());
        collection.sort(new EmployeSalary());

        for (EmployeDto employeDto : collection){
            System.out.println(employeDto);
        }

    }
}

package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.BillDto;

import java.util.Comparator;

public class BillIssueDate implements Comparator<BillDto> {
    @Override
    public int compare(BillDto o1, BillDto o2) {
        System.out.println(o1.getBillissueDate()+ " " +o2.getBillissueDate());
        return o1.getBillissueDate().compareTo(o2.getBillissueDate());
    }
}

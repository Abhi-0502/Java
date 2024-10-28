package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.BillDto;

import java.util.Comparator;

public class BillDueDate implements Comparator<BillDto> {
    @Override
    public int compare(BillDto o1, BillDto o2) {
        System.out.println(o1.getBillDueDate() + " " + o2.getBillDueDate());
        return o1.getBillDueDate().compareTo(o2.getBillDueDate());
    }
}

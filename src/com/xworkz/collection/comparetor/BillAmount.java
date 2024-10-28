package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.BillDto;

import java.util.Comparator;

public class BillAmount implements Comparator<BillDto> {

    @Override
    public int compare(BillDto o1, BillDto o2) {
        System.out.println(o1.getBillAmount() + " " + o2.getBillAmount());
        return (int) (o1.getBillAmount() - o2.getBillAmount());
    }
}

package com.xworkz.collection.comparetor;

import com.xworkz.collection.dto.BillDto;

import java.util.Comparator;

public class BillId implements Comparator<BillDto> {

    @Override
    public int compare(BillDto o1, BillDto o2) {
        System.out.println(o1.getId() + " " + o2.getId());
        return (int) o1.getId() - o2.getId();
    }
}

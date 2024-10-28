package com.xworkz.collection.dto;


import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class BillDto implements Comparator<BillDto> {

    private int id;
    private String billissueDate;
    private String  billDueDate;
    private double billAmount;

    @Override
    public int compare(BillDto o1, BillDto o2) {

       return (int) (o1.getId() - o2.getId());
    }
}

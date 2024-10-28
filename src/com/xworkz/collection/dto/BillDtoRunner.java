package com.xworkz.collection.dto;

import com.xworkz.collection.comparetor.BillAmount;
import com.xworkz.collection.comparetor.BillDueDate;
import com.xworkz.collection.comparetor.BillId;
import com.xworkz.collection.comparetor.BillIssueDate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BillDtoRunner {

    public static void main(String[] args) {

         //Collection<ProductDto> collection = new ArrayList<>();
        List<BillDto> collection = new ArrayList<>();
        BillDto dto1 = new BillDto(1,"10/05/14","13/06/16",500);
        BillDto dto2 = new BillDto(2,"15/06/15","12/07/18",9000);
        BillDto dto3 = new BillDto(3,"20/07/14","28/09/16",700);
        BillDto dto4 = new BillDto(4,"11/05/11","13/06/18",400);
        BillDto dto5 = new BillDto(5,"28/09/22","19/011/23",200);
        BillDto dto6 = new BillDto(6,"19/05/20","29/06/21",5000);
        BillDto dto7 = new BillDto(7,"28/04/24","29/05/26",900);
        BillDto dto8 = new BillDto(8,"18/03/24","19/06/25",700);

        collection.add(dto1);
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);
        collection.add(dto6);
        collection.add(dto7);
        collection.add(dto8);

        collection.sort(new BillDto() );
        collection.sort(new BillId());
        collection.sort(new BillDueDate());
        collection.sort(new BillIssueDate());
        collection.sort(new BillAmount());

        //collection.stream().sorted(Comparator.comparing((o1,o2)->o1.))
        for (BillDto billDto : collection){
            System.out.println(billDto);
        }



    }
}

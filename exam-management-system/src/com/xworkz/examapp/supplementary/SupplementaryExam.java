package com.xworkz.examapp.supplementary;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

// Inheritance
public class SupplementaryExam extends Exam{

    int noOfAttempts = 1;
    @Override
    public boolean allow(HallTicket ticket){
        if(noOfAttempts > 1){
            if(fees == 300){

                super.ticket = ticket;
                super.ticket.displayDetails();
            }else
        }

    }
}

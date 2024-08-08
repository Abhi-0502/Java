package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {

    public int fees;
    public HallTicket ticket;


    public boolean allow(HallTicket ticket) {
        boolean isAllowed = false;
        if (fees == 1800) {
            System.out.println("fess is paid .......collect your HallTicket");
            if (ticket != null){
                this.ticket = ticket;
                this.ticket.displayDetails();
            isAllowed = true;
            System.out.println("HallTicket is issued....proceed the exam ");
        } else System.out.println("No HallTicket Found");
    } else
            System.out.println("first pay the fees");
    return isAllowed;

}

}

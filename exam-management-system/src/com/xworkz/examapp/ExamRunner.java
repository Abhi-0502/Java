package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamRunner {

    public static void main(String[] args){
        Exam exam = new Exam();
        exam.fees = 1800;

        HallTicket ticket = new HallTicket();
        ticket.hallTicketId = 123456;
        ticket.candidateName = "abhi";
        ticket.SubjectName = "java";
        ticket.usn = "4CA20CS001";
        ticket.subjectCode = "18CS75";

        exam.allow(ticket);
    }
}

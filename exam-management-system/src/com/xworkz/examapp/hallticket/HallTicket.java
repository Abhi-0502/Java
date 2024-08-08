package com.xworkz.examapp.hallticket;

public class HallTicket {

    public int hallTicketId ;
    public String candidateName;
    public String SubjectName;
    public String usn;
    public String subjectCode;

    public void displayDetails(){
        System.out.println("The hallticketId is:"+ this.hallTicketId);
        System.out.println("The candidateName is :"+ this.candidateName);
        System.out.println("the subjectNmae is :"+ this.subjectCode);
        System.out.println("the usn is :"+ this.usn);
        System.out.println("the subjectCode is :"+ this.subjectCode);

    }
}

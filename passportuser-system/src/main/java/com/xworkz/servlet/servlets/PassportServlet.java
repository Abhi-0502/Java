package com.xworkz.servlet.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/passportUser")
public class PassportRunner extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String loc =req.getParameter("cprlocation");
        String locl =req.getParameter("dcorLocation");
        String name= req.getParameter( "givenName");
        String dob =req.getParameter( "dob");
         String email= req.getParameter("email") ;
        String nam= req.getParameter("surname");
        String eml= req.getParameter("isEmailLoginSame");
        String Id = req.getParameter("LogInId");
        String pwd= req.getParameter("password");
        String ans =req.getParameter("hideAns");
        String conpwd= req.getParameter("confirmPassword");
        String captcha= req.getParameter( "captcha");

        PrintWriter writer= resp.getWriter();
        writer.print("Rgistration successfull!!!");

    }
}

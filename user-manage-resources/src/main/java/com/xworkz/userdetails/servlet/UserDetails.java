package com.xworkz.userdetails.servlet;

import com.xworkz.userdetails.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = {"/login"})
@WebServlet("/login")
public class UserDetails extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //processing the request
        String firstName = req.getParameter("firstName");
          String lastName =req.getParameter("LastName");
         String PhoneNumber = req.getParameter("phonenumber");
         String Email = req.getParameter("email");
         String DoB = req.getParameter("dob");
         String AdderNumber = req.getParameter("addernumber");
         String PanNumber = req.getParameter("pannumber");
         String Address = req.getParameter("address");
         String password = req.getParameter("password");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(" Thank You " + firstName + " For Regestering sucessfully");

        UserDto userDto = new UserDto();
        userDto.setUserId(1);
        userDto.setFirstName(firstName);
        userDto.setAge(Integer.parseInt(Address));
        userDto.setAddher(Long.parseLong(AdderNumber));



    }
}

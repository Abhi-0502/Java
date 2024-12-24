package com.xworkz.servlet;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.utill.SessionFactoryUtill;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginDetails extends HttpServlet {

    public LoginDetails(){
        System.out.println("object is created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String value = req.getParameter("userName");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.write("Thank You "+ value);
        System.out.println("Dopost method created");
        String firstName = req.getParameter("firstName");

        req.setAttribute("key", firstName);
        req.setAttribute("msg","abhi");
        //Servlet chaining
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req, resp);
        System.out.println("dopost method ended");

//        SessionFactoryUtill sessionFactoryUtill = new SessionFactoryUtill();
//         SessionFactoryUtill.getEntityManagerFactory();

    }
}

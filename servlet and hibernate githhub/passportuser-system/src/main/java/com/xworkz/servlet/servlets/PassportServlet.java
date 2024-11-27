package com.xworkz.servlet.servlets;

import com.xworkz.servlet.dto.PassportDto;
import com.xworkz.servlet.service.PassportService;
import com.xworkz.servlet.service.PassportServicesImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/passport")
public class PassportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String loc =req.getParameter("cprLocation");
        String locl =req.getParameter("dcdrLocation");
        String name= req.getParameter( "givenName");
        String dob =req.getParameter( "dob");
        String email= req.getParameter("email") ;
        String nam= req.getParameter("surName");
        String eml= req.getParameter("isEmailLoginSame");
        String login = req.getParameter("loginId");
        String pwd= req.getParameter("pwd");
        String ans =req.getParameter("hideAns");
        String conpwd= req.getParameter("confirmPwd");
        String captcha= req.getParameter( "captcha");
      System.out.println(loc +"   validated      "+ locl+"   :"+name+"      "+dob+"    "+email+"      "+
              nam+"   "  +eml+  "    "+pwd+ "  "+ ans+"   "+conpwd+"  "+captcha+"     :" );


        PassportDto dto = new PassportDto();
        dto.setCprLocation(loc);
        dto.setDcdrLocation(Integer.parseInt(locl));
        dto.setGivenName(name);
        dto.setDob(dob);
        dto.setEmail(email);
        dto.setSurName(nam);
        dto.setEmailLoginSame (Boolean.parseBoolean (eml));
        System.out.println(login);
        dto.setLoginId(Integer.parseInt(login));
        dto.setPwd(pwd);
        dto.setHideAns(ans);
        dto.setConfirmPwd(conpwd);
        dto.setCaptcha(captcha);

        PassportService service = new PassportServicesImpl();
        service.validateAndSavePassport(dto);

        PrintWriter writer= resp.getWriter();
        writer.print("Registration successfully!!!");

    }
}

package com.xworkz.event.servletrunner;

import com.xworkz.event.dao.EventDao;
import com.xworkz.event.dao.EventDaoImpl;
import com.xworkz.event.dto.EventDto;
import com.xworkz.event.service.EventService;
import com.xworkz.event.service.EventServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class login extends HttpServlet {

    EventService eventService = new EventServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String value1 = req.getParameter("eventType");
        String value2 = req.getParameter("planner");
        String value3 = req.getParameter("startDate");
        String value4 = req.getParameter("EndDate");
        String value5 = req.getParameter("description");
        String value6 = req.getParameter("isAllDayEvent");
        System.out.println("validated"+value1 + "   " + value2 + "   " + value3 + "   "+ value4 + "   "+ value5 + "   "+ value6 + "   :");

        EventDto eventDto = new EventDto();
        eventDto.setEventType(value1);
        eventDto.setPlanner(value2);
        eventDto.setStartDate(value3);
        eventDto.setEndDate(value4);
        eventDto.setDescription(value5);
        eventDto.setAllDayEvent(Boolean.parseBoolean(value6));

        EventDao eventDao = new EventDaoImpl();
        EventService eventService = new EventServiceImpl();
        eventService.addEvent(eventDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write(value1 + " added successfully" );

    }
}

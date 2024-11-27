package com.xworkz.event.dao;

import com.xworkz.event.dto.EventDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EventDaoImpl implements EventDao{


    @Override
    public boolean addEvent(EventDto eventdto) {
        System.out.println("Dao is Running");
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(EventDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(eventdto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }

    @Override
    public EventDto getEventById(int id) {
        System.out.println("Dao is Running");
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(EventDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        EventDto dto =session.get(EventDto.class,id);
        session.close();
        sessionFactory.close();
        return dto;
    }
}

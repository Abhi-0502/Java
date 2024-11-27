package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.PassportDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PassportDaoImpl implements PassportDao{

    PassportDto passportDto=new PassportDto();

    @Override
    public boolean addPassport(PassportDto passportDto) {
        System.out.println("Dao is Running");
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(PassportDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(passportDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }
}

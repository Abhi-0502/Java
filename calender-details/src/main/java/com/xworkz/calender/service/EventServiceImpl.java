package com.xworkz.calender.service;

import com.xworkz.calender.dao.EventDao;
import com.xworkz.calender.dao.EventDaoImpl;
import com.xworkz.calender.dto.EventDto;

import java.time.LocalDateTime;
import java.util.List;

public class EventServiceImpl implements EventService{

        private EventDao eventDao = new EventDaoImpl();

        @Override
        public void addEvent(EventDto event) {
            eventDao.addEvent(event);
        }


    @Override
        public EventDto getEventById(int id) {
            return eventDao.getEventById(id);
        }

    @Override
        public void updateEventStartById(LocalDateTime start, int id) {
            eventDao.updateEventStartById(start, id);
        }

        @Override
        public void removeEvent(int id) {
            eventDao.removeEvent(id);
        }

        @Override
        public List<EventDto> getAllEvents() {
            return eventDao.getAllEvents();
        }
    }



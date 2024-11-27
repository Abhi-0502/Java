package com.xworkz.event.dao;

import com.xworkz.event.dto.EventDto;

public interface EventDao {

    public boolean addEvent(EventDto eventdto);
    EventDto getEventById(int id);
}

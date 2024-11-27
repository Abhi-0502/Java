package com.xworkz.event.service;

import com.xworkz.event.dto.EventDto;

public interface EventService {

    public boolean addEvent(EventDto eventdto);
    EventDto getEventById(int id);
}

package com.xworkz.calender.service;

import com.xworkz.calender.dto.EventDto;

import java.time.LocalDateTime;
import java.util.List;

public interface EventService {

    void addEvent(EventDto event);
    EventDto getEventById(int id);
    void updateEventStartById(LocalDateTime start, int id);
    void removeEvent(int id);
    List<EventDto> getAllEvents(); // Optional for listing
}

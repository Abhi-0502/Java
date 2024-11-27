package com.xworkz.calender.runner;

import com.xworkz.calender.dto.EventDto;
import com.xworkz.calender.service.EventService;
import com.xworkz.calender.service.EventServiceImpl;

import java.time.LocalDateTime;

public class EventRunner {


        public static void main(String[] args) {
            EventService eventService = new EventServiceImpl();

            // Add an event
            EventDto event = new EventDto();
            event.setEventType("holiday");
            event.setWhat("Bank Holiday");
            event.setWho("John Doe");
            event.setStart(LocalDateTime.of(2024, 11, 22, 9, 0));
            event.setEnd(LocalDateTime.of(2024, 11, 22, 17, 0));
            event.setAllDayEvent(false);
            event.setDescription("A public holiday.");

            eventService.addEvent(event);
            System.out.println("Event added successfully!");

            // Get an event by ID
            EventDto fetchedEvent = eventService.getEventById(event.getId());
            System.out.println("Fetched Event: " + fetchedEvent.getWhat());

            // Update the start time of an event
            eventService.updateEventStartById(LocalDateTime.of(2024, 11, 22, 10, 0), event.getId());
            System.out.println("Event start time updated.");

            // Remove an event
            eventService.removeEvent(event.getId());
            System.out.println("Event removed.");
        }
    }



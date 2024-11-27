package com.xworkz.event.service;

import com.xworkz.event.dao.EventDao;
import com.xworkz.event.dao.EventDaoImpl;
import com.xworkz.event.dto.EventDto;

public class EventServiceImpl implements EventService{

    EventDao eventDao = new EventDaoImpl();
    @Override
    public boolean addEvent(EventDto eventdto) {
        boolean isEventTypeValid = false;
        boolean isPlannerValid = false;
        boolean isStartdateValid = false;
        boolean isEnddateValid = false;
        boolean isDescriptionValid = false;
        boolean isEventStored = false;

        if (eventdto != null) {
            // Validate the event type
            if (eventdto.getEventType() != null && !eventdto.getEventType().isEmpty()) {
                System.out.println("EventType is valid!");
                isEventTypeValid = true;
            } else {
                System.out.println("EventType is invalid.");
            }

            if(eventdto.getPlanner() != null && !eventdto.getPlanner().isEmpty()){
                System.out.println("Event Planner is valid");
                isPlannerValid = true;
            }else {
                System.out.println("Event Planner is invalid");
            }

            if(eventdto.getStartDate() != null && !eventdto.getStartDate().isEmpty()){
                System.out.println("Event StartDate is Valid");
                isStartdateValid = true;
            }else {
                System.out.println("Event StartDate is inValid");
            }

            if(eventdto.getEndDate() != null && !eventdto.getEndDate().isEmpty()){
                System.out.println("Event EndDate is Valid");
            }else {
                System.out.println("Event EndDate is Valid");
            }
            // Validate the description
            if (eventdto.getDescription() != null && !eventdto.getDescription().isEmpty()) {
                System.out.println("Description is valid!");
                isDescriptionValid = true;
            } else {
                System.out.println("Description is invalid.");
            }

            // Store the event if both validations pass
            if (isEventTypeValid && isPlannerValid && isStartdateValid && isEnddateValid && isDescriptionValid) {
                System.out.println("Adding the event to the database...");
                isEventStored  = eventDao.addEvent(eventdto); // Call DAO to store the event
                isEventStored = true;
            } else {
                System.out.println("Event validation failed. Cannot add the event.");
            }
        } else {
            System.out.println("EventDto is null. Cannot process.");
        }

        return isEventStored; // Return the status of the operation
}

    @Override
    public EventDto getEventById(int id) {
        return null;
    }
}

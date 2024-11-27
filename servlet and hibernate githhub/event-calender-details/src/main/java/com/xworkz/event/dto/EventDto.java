package com.xworkz.event.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "event")
    public class EventDto {
        @GenericGenerator(name = "abhi",strategy = "increment")
        @GeneratedValue(generator = "abhi")

        @Id
        private int id;

        @Column(name ="eventType" )
        private String eventType; // travel, leave, birthdays, holiday

        @Column(name = "planner")
        private String planner; // Short info

        @Column(name = "startDate")
        private String startDate; // Your name

        @Column(name="EndDate")
        private String EndDate; // Start time

        @Column(name = "isAllDayEvent")
        private boolean isAllDayEvent; // Indicates if all-day

        @Column(name = "description")
        private String description; // Optional description

    }


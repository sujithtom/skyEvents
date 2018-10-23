package com.tomsdev.skyevents.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


@Data
@Entity
public class Event {
    private @Id @GeneratedValue long id;
    private String eventName;
    private String eventDescription;
    private String eventShortDescription;
    private Date eventStartDate;
    private Date eventEndDate;
    private String eventImage;
    private List<EventType> eventTypes;
    private List<Location> visibleFromLocation;
}

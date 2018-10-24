package com.tomsdev.skyevents.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


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

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventShortDescription='" + eventShortDescription + '\'' +
                ", eventStartDate=" + eventStartDate +
                ", eventEndDate=" + eventEndDate +
                ", eventTypes= { " + eventTypes.stream().map(EventType::toString).collect(Collectors.joining(", ")) + " }" +
                ", visibleFromLocation= { " + visibleFromLocation.stream().map(Location::toString).collect(Collectors.joining(", ")) + " }" +
                '}';
    }

    public Event(String eventName, String eventDescription, String eventShortDescription, Date eventStartDate, Date eventEndDate,
                 String eventImage, List<EventType> eventTypes, List<Location> visibleFromLocation) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventShortDescription = eventShortDescription;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventImage = eventImage;
        this.eventTypes = eventTypes;
        this.visibleFromLocation = visibleFromLocation;
    }
}

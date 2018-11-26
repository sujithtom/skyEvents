package com.tomsdev.skyevents.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {
    private @Id @GeneratedValue long id;
    private String eventName;
    @Column(columnDefinition="TEXT")
    private String eventDescription;
    private String eventShortDescription;
    private Date eventStartDate;
    private Date eventEndDate;
    private String eventImage;
    // private List<EventType> eventTypes;
    // private List<Location> visibleFromLocation; // TODO: introduce this later

    @Override
    public String toString() {
        return "Event{" +
                 "eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventShortDescription='" + eventShortDescription + '\'' +
                ", eventStartDate=" + eventStartDate +
                ", eventEndDate=" + eventEndDate +
                // ", eventTypes= { " + eventTypes.stream().map(EventType::toString).collect(Collectors.joining(", ")) + " }" +
                // ", visibleFromLocation= { " + visibleFromLocation.stream().map(Location::toString).collect(Collectors.joining(", ")) + " }" +
                '}';
    }

     public Event() {
     }

    public Event(@JsonProperty("eventName") String eventName,
                 @JsonProperty("eventDescription") String eventDescription,
                 @JsonProperty("eventShortDescription") String eventShortDescription,
                 @JsonProperty("eventStartDate") Date eventStartDate,
                 @JsonProperty("eventEndDate") Date eventEndDate,
                 @JsonProperty("eventImage") String eventImage
                 // ,@JsonProperty("eventTypes") ArrayList<EventType> eventTypes
    ) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventShortDescription = eventShortDescription;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventImage = eventImage;
        // this.eventTypes = eventTypes;
    }
}

package com.tomsdev.skyevents.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class EventType {
    private @Id @GeneratedValue long id;
    private String eventType;

    public long getId() {
        return id;
    }

    public String getEventType() {
        return eventType;
    }

    public EventType(@JsonProperty("eventType") String eventType) {
        this.eventType = eventType;
    }
}

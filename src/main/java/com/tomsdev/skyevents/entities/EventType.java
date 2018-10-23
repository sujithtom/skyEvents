package com.tomsdev.skyevents.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class EventType {
    private @Id @GeneratedValue long id;
    private String eventType;
}

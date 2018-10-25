package com.tomsdev.skyevents.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Location {
    private @Id @GeneratedValue long id;
    private String locationName;

    public Location(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return locationName;
    }
}

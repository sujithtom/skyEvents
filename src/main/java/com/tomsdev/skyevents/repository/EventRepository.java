package com.tomsdev.skyevents.repository;

import com.tomsdev.skyevents.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}

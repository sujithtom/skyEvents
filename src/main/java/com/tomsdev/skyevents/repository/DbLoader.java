package com.tomsdev.skyevents.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tomsdev.skyevents.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@Component
public class DbLoader implements CommandLineRunner {
    private final EventRepository repository;

    @Autowired
    public DbLoader(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Event>> eventsType = new TypeReference<List<Event>>() {};
        InputStream is = TypeReference.class.getResourceAsStream("/json/sampleData.json");
        try {
            List<Event> events = mapper.readValue(is, eventsType);
            for (Event event:events) {
                repository.save(event);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

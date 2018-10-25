package com.tomsdev.skyevents.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DbLoader implements CommandLineRunner {
    private final EventRepository repository;

    @Autowired
    public DbLoader(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
    }
}

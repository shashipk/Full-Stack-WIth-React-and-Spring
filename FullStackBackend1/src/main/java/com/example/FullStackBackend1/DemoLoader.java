package com.example.FullStackBackend1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    @Autowired
    ContactRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("Ramu", "Kaka", "kuchbhi@nhi.com"));
        this.repository.save(new Contact("SHashi", "Kumar", "bnmj@nhi.com"));
    }
}


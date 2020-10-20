package org.geeksforgeeks.jbdl7.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/user") // /user/**
    public String getUser(){
        return "Hello user - ";
    }

    @GetMapping("/admin") //
    public String getAdmin() {
        return "Hello Admin - ";
    }

    @GetMapping("/general") // /**
    public String getPerson() {
        return "Hello Person - ";
    }
}

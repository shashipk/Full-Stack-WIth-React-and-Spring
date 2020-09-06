package com.example.BackendApp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    DB db = new DB();

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello Coders!! 1st API";
    }

    // https://www.google.com/search?q=sachin
    // http://localhost:9090/convert?q=5

    @GetMapping("/convert")
    public int convertToINR(@RequestParam int q){
        int usd = q;
        return 74 * usd;
    }

    // https://www.google.com/search?q=sachin
    // http://localhost:9090/search?q=sachin
    @GetMapping("/search")
    public String searchAWord(@RequestParam String q){
        return db.search(q);
    }

    @GetMapping("/users")
    public User searchAUser(@RequestParam String q){
        return db.searchAUser(q);
    }




}

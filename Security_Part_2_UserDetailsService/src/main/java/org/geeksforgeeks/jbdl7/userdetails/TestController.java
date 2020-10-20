package org.geeksforgeeks.jbdl7.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public String getUser(@RequestParam("name") String name){
        return "Hello user - " + name;
    }

    @GetMapping("/admin")
    public String getAdmin(@RequestParam("name") String name){
        return "Hello Admin - " + name;
    }

    @GetMapping("/general")
    public String getPerson(@RequestParam("name") String name){
        return "Hello Person - " + name;
    }

    @PostMapping("/signup")
    public void signup(@RequestParam("name") String name, @RequestParam("pass") String pass){

        // 1. Check whether this username exists in db or not
        // 2. Encrypt this password
        // 3. Create new user and store it in db

        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        String encoded_pass = encoder.encode(pass);

//        MyUser user = new MyUser();
//
//        userRepository.save()
    }
}

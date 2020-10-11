package com.example.BackendApp1;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

    //  http://localhost:9090/users?q=sachin - query param

    @GetMapping("/users")
    public User searchAUser(@RequestParam String q){

        return db.searchAUser(q);
    }

    // https://api.github.com/users/ravi - path param

    // http://localhost:9090/users?q=sachin : query param
    // http://localhost:9090/users/sachin : path param
    @GetMapping("/users/{name}")
    public User searchAUser2(@PathVariable("name")  String q){
        return db.searchAUser(q);
    }

    // Read : Get, Write (Insert / Update) : Post

    @GetMapping("/usersAll")
    public List<User> getAllUsers(){
        return db.getAllUsers();
    }

    @PostMapping("/users")
    public boolean createAUser(@RequestBody User user){
        return db.addAUser(user);
    }

    // Put : Update (Write)
    @PutMapping("/users")
    public boolean updateAUser(@RequestBody User user){
        System.out.println(user.toString());
        return db.updateAUser(user);
    }

    // Delete: Deletion
    @DeleteMapping("/users/{name}")
    public boolean deleteAUser(@PathVariable String name){
        return db.deleteAUser(name);
    }

    @ApiOperation("This API is to test the features of ResponseEntity")
    @GetMapping("/dummyUsers")
    public ResponseEntity<User> searchAUser3(@RequestParam int id){


        User user = db.searchAUserBYId(id);
        MultiValueMap<String, String> headers =
                new LinkedMultiValueMap<>();
        // server : shashi's server , my own server
        LinkedList<String> values = new LinkedList<>();
        values.add("shashi's server");
        values.add("my own server");
        headers.put("server",values);
        headers.put("set-cookies", Collections.singletonList("abcnskdbkala"));
        ResponseEntity<User> responseEntity =
                new ResponseEntity<User>(user,headers, HttpStatus.CREATED);

        return responseEntity;

    }









}

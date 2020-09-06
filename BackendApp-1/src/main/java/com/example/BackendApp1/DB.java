package com.example.BackendApp1;

import java.util.ArrayList;
import java.util.HashMap;

public class DB {

    HashMap<String, String> storage =
            new HashMap<>();

    ArrayList<User> userTable = new ArrayList<>();

    public DB(){
        storage.put("Sachin", "A great Batsman");
        storage.put("Dravid","Wall of Indian Cricket Team");

        userTable.add(new User(1,20,"Ramu"));
        userTable.add(new User(2,25,"Raka"));
    }

    public String search(String word){
        if(storage.containsKey(word)){
            return storage.get(word);
        }
        return "Couldn't find anything";
    }

    public User searchAUser(String name){
        for(User user : userTable){
            if(user.getName().equals(name))
                return user;
        }

        return null;
    }
}

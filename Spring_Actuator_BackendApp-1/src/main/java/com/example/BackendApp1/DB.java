package com.example.BackendApp1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DB {

    // word Table
    HashMap<String, String> storage =
            new HashMap<>();

    // User Table
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

    public User searchAUserBYId(int id){
        for(User user : userTable){
            if(user.getId()==(id))
                return user;
        }

        return null;
    }

    public List<User> getAllUsers(){
        return userTable;
    }

    public boolean addAUser(User user){
        userTable.add(user);
        return true;
    }

    public boolean updateAUser(User user){
        for(User user1 : userTable){
            if(user1.getName().equals(user.getName())){
                user1.setAge(user.getAge());
            System.out.println(user1.getAge());
            return true;
            }
        }
        return false;
    }

    public boolean deleteAUser(String name){
        for(User user : userTable){
            if(user.getName().equals(name))
                userTable.remove(user);
                return true;
        }
        return false;
    }
}

package org.geeksforgeeks.jbdl7.userdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

    public MyUser findByusername(String username);
}

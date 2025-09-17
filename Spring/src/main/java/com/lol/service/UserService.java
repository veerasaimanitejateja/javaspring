package com.lol.service;

import com.lol.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {
        // Hardcoded users
    	users.add(new User("john", "john@example.com", "password123"));
        users.add(new User("alice", "alice@example.com", "alicepass"));
        users.add(new User("bob", "bob@example.com", "bobpass"));
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findByUsername(String username) {
        return users.stream()
        		 .filter(u -> u.getUsername().equalsIgnoreCase(username))
                .findFirst()
                .orElse(null);
    }
    
    public User findByEmail(String email) {
        return users.stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
package com.lol.model;

public class User {

	private String name;
    private String email;
    private String password;

    // Default constructor
    public User() {}

    // Constructor to initialize User object
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter for name
    public String getUsername() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for password (you'll store the hashed password, not plain text)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

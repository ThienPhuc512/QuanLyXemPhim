package com.example.model;

public class User {
    private String username;
    private String password;
    private String role; // "admin" hoặc "user"

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
} 
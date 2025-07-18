package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private List<User> users = new ArrayList<>();

    public UserModel() {
        // Tài khoản mẫu
        users.add(new User("admin", "admin", "admin"));
        users.add(new User("user", "123", "user"));
    }

    public User authenticate(String username, String password, String role) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        return null;
    }
} 
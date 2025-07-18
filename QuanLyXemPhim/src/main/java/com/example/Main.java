package com.example;

import javax.swing.SwingUtilities;

import com.example.controller.LoginController;
import com.example.model.UserModel;
import com.example.view.LoginView;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserModel model = new UserModel();
            LoginView view = new LoginView();
            new LoginController(model, view);
            view.setVisible(true);
        });
    }
} 
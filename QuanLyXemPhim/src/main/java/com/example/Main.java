package com.example;

import javax.swing.SwingUtilities;

import com.example.controller.LoginController;
import com.example.model.UserModel;
import com.example.view.LoginView;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
            javax.swing.UIManager.put("Button.arc", 20); // Bo góc
            javax.swing.UIManager.put("Button.hoverBackground", new java.awt.Color(0, 102, 177)); // Xanh BMW khi hover
            javax.swing.UIManager.put("Button.hoverForeground", java.awt.Color.WHITE); // Chữ trắng khi hover
            javax.swing.UIManager.put("Button.background", new java.awt.Color(231, 26, 15)); // Đỏ CGV mặc định
            javax.swing.UIManager.put("Button.foreground", java.awt.Color.WHITE);
            javax.swing.UIManager.put("Panel.background", java.awt.Color.WHITE);
            javax.swing.UIManager.put("Label.foreground", new java.awt.Color(33, 37, 41));
        } catch (Exception ex) {
            System.err.println("Không thể cài đặt FlatLaf");
        }
        SwingUtilities.invokeLater(() -> {
            UserModel model = new UserModel();
            LoginView view = new LoginView();
            new LoginController(model, view);
            view.setVisible(true);
        });
    }
} 
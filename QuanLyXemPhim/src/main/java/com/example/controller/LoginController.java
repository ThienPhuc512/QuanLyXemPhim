package com.example.controller;

import com.example.model.User;
import com.example.model.UserModel;
import com.example.view.LoginView;

public class LoginController {
    private UserModel model;
    private LoginView view;

    public LoginController(UserModel model, LoginView view) {
        this.model = model;
        this.view = view;

        view.btnLogin.addActionListener(e -> login());
    }

    private void login() {
        String username = view.txtUser.getText();
        String password = new String(view.txtPass.getPassword());
        String role = (String) view.cbRole.getSelectedItem();

        User user = model.authenticate(username, password, role);
        if (user != null) {
            view.showMessage("Đăng nhập thành công với vai trò: " + user.getRole());
            // Ở đây bạn có thể mở MainFrame hoặc giao diện tương ứng
        } else {
            view.showMessage("Sai thông tin đăng nhập!");
        }
    }
} 
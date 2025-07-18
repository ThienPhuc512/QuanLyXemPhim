package com.example.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {
    public JTextField txtUser = new JTextField();
    public JPasswordField txtPass = new JPasswordField();
    public JComboBox<String> cbRole = new JComboBox<>(new String[]{"admin", "user"});
    public JButton btnLogin = new JButton("Đăng nhập");

    public LoginView() {
        setTitle("Đăng nhập");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.add(new JLabel("Tên đăng nhập:"));
        panel.add(txtUser);
        panel.add(new JLabel("Mật khẩu:"));
        panel.add(txtPass);
        panel.add(new JLabel("Vai trò:"));
        panel.add(cbRole);
        panel.add(new JLabel());
        panel.add(btnLogin);

        add(panel);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
} 
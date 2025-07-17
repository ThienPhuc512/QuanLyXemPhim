package com.example;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Đăng nhập hệ thống");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblUser = new JLabel("Tên đăng nhập:");
        JTextField txtUser = new JTextField();
        JLabel lblPass = new JLabel("Mật khẩu:");
        JPasswordField txtPass = new JPasswordField();
        JLabel lblRole = new JLabel("Loại tài khoản:");
        JComboBox<String> cbRole = new JComboBox<>(new String[]{"Nhân viên", "Admin", "Khách hàng"});
        JButton btnLogin = new JButton("Đăng nhập");

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(lblUser, gbc);
        gbc.gridx = 1;
        panel.add(txtUser, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(lblPass, gbc);
        gbc.gridx = 1;
        panel.add(txtPass, gbc);
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(lblRole, gbc);
        gbc.gridx = 1;
        panel.add(cbRole, gbc);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        panel.add(btnLogin, gbc);

        add(panel);

        btnLogin.addActionListener(e -> {
            String user = txtUser.getText();
            String pass = new String(txtPass.getPassword());
            String role = (String) cbRole.getSelectedItem();
            // Tài khoản mẫu
            boolean success = false;
            if ("Admin".equals(role) && user.equals("admin") && pass.equals("admin")) success = true;
            if ("Nhân viên".equals(role) && user.equals("nhanvien") && pass.equals("123")) success = true;
            if ("Khách hàng".equals(role) && user.equals("khach") && pass.equals("123")) success = true;
            if (success) {
                // Đăng nhập thành công, mở MainFrame
                SwingUtilities.invokeLater(() -> {
                    new MainFrame().setVisible(true);
                });
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
} 
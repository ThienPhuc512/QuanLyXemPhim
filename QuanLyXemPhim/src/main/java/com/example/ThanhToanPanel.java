package com.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ThanhToanPanel extends JPanel {
    public ThanhToanPanel() {
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Thanh toán", SwingConstants.CENTER);
        add(title, BorderLayout.NORTH);
        
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.add(new JLabel("Mã vé:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Tên khách hàng:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Tổng tiền:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Hình thức thanh toán:"));
        formPanel.add(new JComboBox<>(new String[]{"Tiền mặt", "Thẻ"}));
        add(formPanel, BorderLayout.CENTER);
        
        JButton btnThanhToan = new JButton("Thanh toán");
        JPanel btnPanel = new JPanel();
        btnPanel.add(btnThanhToan);
        add(btnPanel, BorderLayout.SOUTH);
    }
} 
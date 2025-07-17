package com.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DatVePanel extends JPanel {
    public DatVePanel() {
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Đặt vé", SwingConstants.CENTER);
        add(title, BorderLayout.NORTH);
        
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.add(new JLabel("Phim:"));
        formPanel.add(new JComboBox<>());
        formPanel.add(new JLabel("Suất chiếu:"));
        formPanel.add(new JComboBox<>());
        formPanel.add(new JLabel("Rạp:"));
        formPanel.add(new JComboBox<>());
        formPanel.add(new JLabel("Ghế:"));
        formPanel.add(new JComboBox<>());
        formPanel.add(new JLabel("Tên khách hàng:"));
        formPanel.add(new JTextField());
        add(formPanel, BorderLayout.CENTER);
        
        JButton btnDatVe = new JButton("Đặt vé");
        JPanel btnPanel = new JPanel();
        btnPanel.add(btnDatVe);
        add(btnPanel, BorderLayout.SOUTH);
    }
} 
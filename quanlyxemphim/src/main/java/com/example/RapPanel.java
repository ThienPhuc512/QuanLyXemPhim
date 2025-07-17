package com.example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class RapPanel extends JPanel {
    public RapPanel() {
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Quản lý rạp", SwingConstants.CENTER);
        add(title, BorderLayout.NORTH);
        
        // Bảng rạp (placeholder)
        String[] columns = {"Mã rạp", "Tên rạp", "Địa chỉ", "Số ghế"};
        Object[][] data = {};
        JTable table = new JTable(data, columns);
        add(new JScrollPane(table), BorderLayout.CENTER);
        
        // Panel nút chức năng
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Thêm"));
        buttonPanel.add(new JButton("Sửa"));
        buttonPanel.add(new JButton("Xóa"));
        buttonPanel.add(new JButton("Làm mới"));
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 
package com.example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class PhimPanel extends JPanel {
    public PhimPanel() {
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Quản lý phim", SwingConstants.CENTER);
        add(title, BorderLayout.NORTH);
        
        // Bảng phim (placeholder)
        String[] columns = {"Mã phim", "Tên phim", "Thể loại", "Thời lượng"};
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
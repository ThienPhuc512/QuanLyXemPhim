package com.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class NewsAndOffersPanel extends JPanel {
    public NewsAndOffersPanel() {
        setLayout(new GridLayout(1, 2, 20, 0)); // 1 hàng, 2 cột, cách nhau 20px

        // Panel tin tức
        JPanel newsPanel = new JPanel(new BorderLayout());
        newsPanel.setBorder(BorderFactory.createTitledBorder("Tin tức"));
        DefaultListModel<String> newsModel = new DefaultListModel<>();
        newsModel.addElement("Phim bom tấn ra mắt tháng 6!");
        newsModel.addElement("Rạp chiếu phim khai trương chi nhánh mới.");
        newsModel.addElement("Lịch chiếu phim tuần này đã cập nhật.");
        JList<String> newsList = new JList<>(newsModel);
        newsPanel.add(new JScrollPane(newsList), BorderLayout.CENTER);

        // Panel ưu đãi
        JPanel offersPanel = new JPanel(new BorderLayout());
        offersPanel.setBorder(BorderFactory.createTitledBorder("Ưu đãi cho khách hàng"));
        DefaultListModel<String> offersModel = new DefaultListModel<>();
        offersModel.addElement("Mua 2 vé tặng 1 bắp rang!");
        offersModel.addElement("Giảm 20% cho thành viên mới.");
        offersModel.addElement("Thứ 4 vui vẻ: Vé chỉ 45.000đ.");
        JList<String> offersList = new JList<>(offersModel);
        offersPanel.add(new JScrollPane(offersList), BorderLayout.CENTER);

        add(newsPanel);
        add(offersPanel);
    }
} 
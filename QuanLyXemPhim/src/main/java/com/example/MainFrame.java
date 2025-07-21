package com.example;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
    private JPanel mainPanel;

    public MainFrame() {
        setTitle("Quản Lý Đặt Vé Xem Phim");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Tạo menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuChucNang = new JMenu("Chức năng");
        JMenuItem menuPhim = new JMenuItem("Quản lý phim");
        JMenuItem menuSuatChieu = new JMenuItem("Quản lý suất chiếu");
        JMenuItem menuPhongChieu = new JMenuItem("Quản lý phòng chiếu");
        JMenuItem menuDatVe = new JMenuItem("Đặt vé");
        JMenuItem menuThanhToan = new JMenuItem("Thanh toán");
        JMenuItem menuNewsOffers = new JMenuItem("Tin tức & Ưu đãi");
        
        menuChucNang.add(menuNewsOffers);
        menuChucNang.add(menuPhim);
        menuChucNang.add(menuSuatChieu);
        menuChucNang.add(menuPhongChieu);
        menuChucNang.add(menuDatVe);
        menuChucNang.add(menuThanhToan);
        menuBar.add(menuChucNang);
        setJMenuBar(menuBar);

        // Main panel
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Padding 30px
        mainPanel.setBackground(java.awt.Color.WHITE); // Nền trắng

        // Thêm logo CGV nếu có file logo, nếu không thì bỏ qua dòng này
        // JLabel logoLabel = new JLabel(new javax.swing.ImageIcon("src/main/resources/cgv_logo.png"));
        // logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel welcomeLabel = new JLabel("Chào mừng đến với CGV Cinema!", SwingConstants.CENTER);
        welcomeLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 32));
        welcomeLabel.setForeground(new java.awt.Color(231, 26, 15)); // Đỏ CGV
        welcomeLabel.setOpaque(false);

        // mainPanel.add(logoLabel, BorderLayout.NORTH); // Bỏ comment nếu có logo
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Sự kiện menu (tạm thời chỉ hiển thị thông báo)
        menuPhim.addActionListener(e -> setMainPanel(new PhimPanel()));
        menuSuatChieu.addActionListener(e -> setMainPanel(new SuatChieuPanel()));
        menuPhongChieu.addActionListener(e -> setMainPanel(new RapPanel()));
        menuDatVe.addActionListener(e -> setMainPanel(new DatVePanel()));
        menuThanhToan.addActionListener(e -> setMainPanel(new ThanhToanPanel()));
        menuNewsOffers.addActionListener(e -> setMainPanel(new NewsAndOffersPanel()));
    }

    private void setMainPanel(JPanel panel) {
        mainPanel.removeAll();
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
} 
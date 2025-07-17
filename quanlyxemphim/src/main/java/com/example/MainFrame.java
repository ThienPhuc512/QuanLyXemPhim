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
        
        menuChucNang.add(menuPhim);
        menuChucNang.add(menuSuatChieu);
        menuChucNang.add(menuPhongChieu);
        menuChucNang.add(menuDatVe);
        menuChucNang.add(menuThanhToan);
        menuBar.add(menuChucNang);
        setJMenuBar(menuBar);

        // Main panel
        mainPanel = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Chào mừng đến với hệ thống quản lý đặt vé xem phim!", SwingConstants.CENTER);
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Sự kiện menu (tạm thời chỉ hiển thị thông báo)
        menuPhim.addActionListener(e -> setMainPanel(new PhimPanel()));
        menuSuatChieu.addActionListener(e -> setMainPanel(new SuatChieuPanel()));
        menuPhongChieu.addActionListener(e -> setMainPanel(new RapPanel()));
        menuDatVe.addActionListener(e -> setMainPanel(new DatVePanel()));
        menuThanhToan.addActionListener(e -> setMainPanel(new ThanhToanPanel()));
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
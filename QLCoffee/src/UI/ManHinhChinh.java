/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Helper.ShareHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author ADMIN
 */
public class ManHinhChinh extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhChinh
     */
    boolean vaiTro;

    public ManHinhChinh() {
        initComponents();
        init();
    }

    void init() {
        this.setLocationRelativeTo(null);
        OpenDangNhap();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        dongHo();
        phanQuyen();
    }

    //phan quyen
    public void phanQuyen() {
        vaiTro = ShareHelper.User.isVaiTro();
        mniQLHoaDon.setEnabled(vaiTro);
        mniQLKhuVuc.setEnabled(vaiTro);
        mniQLMenu.setEnabled(vaiTro);
        mniQLTaiKhoan.setEnabled(vaiTro);
        mniQLThongKe.setEnabled(vaiTro);
        mniSuKien.setEnabled(vaiTro);
    }

    //dang nhap
    synchronized void OpenDangNhap() {
        DangNhapDialog dn = new DangNhapDialog(this, true);
        dn.setVisible(true);
//        phanQuyen();
    }

    void OpenTaiKhoan() {
        TaiKhoan tk = new TaiKhoan();
        pnHome.removeAll();
        pnHome.add(tk);
        pnHome.validate();
        pnHome.repaint();
    }

    //mở form bán hàng.
    void OpenBanHang() {
        BanHang bh = new BanHang();
        pnHome.removeAll();
        pnHome.add(bh);
        pnHome.validate();
        pnHome.repaint();
    }

    //mở form quản lý menu
    void OpenQLMenu() {
        QLMenu mn = new QLMenu();
        pnHome.removeAll();
        pnHome.add(mn);
        pnHome.validate();
        pnHome.repaint();
    }

    void OpenQLKhuVuc() {
        QLKhuVuc kv = new QLKhuVuc();
        pnHome.removeAll();
        pnHome.add(kv);
        pnHome.validate();
        pnHome.repaint();
    }

    void OpenSuKien() {
        SuKienBH sk = new SuKienBH();
        pnHome.removeAll();
        pnHome.add(sk);
        pnHome.validate();
        pnHome.repaint();
    }

    void OpenManHinhBatDau() {
        ManHinhBatDau bd = new ManHinhBatDau();
        pnHome.removeAll();
        pnHome.add(bd);
        pnHome.validate();
        pnHome.repaint();
    }

    void OpenHoaDon() {
        HoaDon hd = new HoaDon();
        pnHome.removeAll();
        pnHome.add(hd);
        pnHome.validate();
        pnHome.repaint();
    }

    void OpenThongKe() {
        ThongKeUI tk = new ThongKeUI();
        pnHome.removeAll();
        pnHome.add(tk);
        pnHome.validate();
        pnHome.repaint();
    }

    Timer t;

    public void dongHo() {
        t = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                SimpleDateFormat dateFomat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss aa");
                Date d = new Date();
                lblTime.setText(dateFomat.format(d));

            }
        });
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnHome = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mniQLKhuVuc = new javax.swing.JMenuItem();
        mniQLMenu = new javax.swing.JMenuItem();
        mniQLHoaDon = new javax.swing.JMenuItem();
        mniQLThongKe = new javax.swing.JMenuItem();
        mniSuKien = new javax.swing.JMenuItem();
        mniQLTaiKhoan = new javax.swing.JMenuItem();
        mniChuyeTaiKhoan = new javax.swing.JMenuItem();
        mniThoat = new javax.swing.JMenuItem();
        mnTrangchu = new javax.swing.JMenu();
        mnBanHang = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnHome.setBackground(new java.awt.Color(107, 70, 52));
        pnHome.setMaximumSize(new java.awt.Dimension(1280, 640));
        pnHome.setMinimumSize(new java.awt.Dimension(1280, 640));
        pnHome.setName(""); // NOI18N
        pnHome.setPreferredSize(new java.awt.Dimension(1280, 640));
        pnHome.setRequestFocusEnabled(false);
        pnHome.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(107, 70, 52));
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Alarm.png"))); // NOI18N
        lblTime.setText("jLabel1");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(107, 70, 52));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cflg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        mnHeThong.setBackground(new java.awt.Color(255, 255, 255));
        mnHeThong.setForeground(new java.awt.Color(107, 70, 52));
        mnHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/settings.png"))); // NOI18N
        mnHeThong.setText("Hệ thống");

        mniQLKhuVuc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniQLKhuVuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/khuVuc.png"))); // NOI18N
        mniQLKhuVuc.setText("Quản lý khu vực");
        mniQLKhuVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLKhuVucActionPerformed(evt);
            }
        });
        mnHeThong.add(mniQLKhuVuc);

        mniQLMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniQLMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hienThi.png"))); // NOI18N
        mniQLMenu.setText("Quản lý menu");
        mniQLMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLMenuActionPerformed(evt);
            }
        });
        mnHeThong.add(mniQLMenu);

        mniQLHoaDon.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniQLHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hoaDon.png"))); // NOI18N
        mniQLHoaDon.setText("Hóa đơn");
        mniQLHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLHoaDonActionPerformed(evt);
            }
        });
        mnHeThong.add(mniQLHoaDon);

        mniQLThongKe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniQLThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thongKe.png"))); // NOI18N
        mniQLThongKe.setText("Thống kê");
        mniQLThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLThongKeActionPerformed(evt);
            }
        });
        mnHeThong.add(mniQLThongKe);

        mniSuKien.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniSuKien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gui.png"))); // NOI18N
        mniSuKien.setText("Sự kiện");
        mniSuKien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSuKienActionPerformed(evt);
            }
        });
        mnHeThong.add(mniSuKien);

        mniQLTaiKhoan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/taiKhoan.png"))); // NOI18N
        mniQLTaiKhoan.setText("Quản lý tài khoản");
        mniQLTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLTaiKhoanActionPerformed(evt);
            }
        });
        mnHeThong.add(mniQLTaiKhoan);

        mniChuyeTaiKhoan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniChuyeTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/chuyenTK.png"))); // NOI18N
        mniChuyeTaiKhoan.setText("Chuyển tài khoản");
        mniChuyeTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyeTaiKhoanActionPerformed(evt);
            }
        });
        mnHeThong.add(mniChuyeTaiKhoan);

        mniThoat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thoat.png"))); // NOI18N
        mniThoat.setText("Thoát");
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        mnHeThong.add(mniThoat);

        jMenuBar1.add(mnHeThong);

        mnTrangchu.setBackground(new java.awt.Color(255, 255, 255));
        mnTrangchu.setForeground(new java.awt.Color(107, 70, 52));
        mnTrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home3.png"))); // NOI18N
        mnTrangchu.setText("Trang chủ");
        mnTrangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnTrangchuMouseClicked(evt);
            }
        });
        mnTrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTrangchuActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnTrangchu);

        mnBanHang.setBackground(new java.awt.Color(255, 255, 255));
        mnBanHang.setForeground(new java.awt.Color(107, 70, 52));
        mnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/banHangNV.png"))); // NOI18N
        mnBanHang.setText("Bán Hàng");
        mnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnBanHangMouseClicked(evt);
            }
        });
        mnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBanHangActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnBanHang);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniQLKhuVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLKhuVucActionPerformed
        // TODO add your handling code here:
        OpenQLKhuVuc();
    }//GEN-LAST:event_mniQLKhuVucActionPerformed

    private void mniQLMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLMenuActionPerformed
        // TODO add your handling code here:
        OpenQLMenu();
    }//GEN-LAST:event_mniQLMenuActionPerformed

    private void mniQLHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLHoaDonActionPerformed
        // TODO add your handling code here:
        OpenHoaDon();
    }//GEN-LAST:event_mniQLHoaDonActionPerformed

    private void mniQLThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLThongKeActionPerformed
        // TODO add your handling code here:
        OpenThongKe();
    }//GEN-LAST:event_mniQLThongKeActionPerformed

    private void mniSuKienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSuKienActionPerformed
        // TODO add your handling code here:
        OpenSuKien();
    }//GEN-LAST:event_mniSuKienActionPerformed

    private void mniQLTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLTaiKhoanActionPerformed
        // TODO add your handling code here:
        OpenTaiKhoan();
    }//GEN-LAST:event_mniQLTaiKhoanActionPerformed

    private void mniChuyeTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyeTaiKhoanActionPerformed
        // TODO add your handling code here:
        OpenDangNhap();
    }//GEN-LAST:event_mniChuyeTaiKhoanActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mnTrangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTrangchuMouseClicked
        // TODO add your handling code here:
        OpenManHinhBatDau();
    }//GEN-LAST:event_mnTrangchuMouseClicked

    private void mnTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTrangchuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnTrangchuActionPerformed

    private void mnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnBanHangMouseClicked
        // TODO add your handling code here:
        OpenManHinhBatDau();
    }//GEN-LAST:event_mnBanHangMouseClicked

    private void mnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBanHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnBanHangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenu mnBanHang;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenu mnTrangchu;
    private javax.swing.JMenuItem mniChuyeTaiKhoan;
    private javax.swing.JMenuItem mniQLHoaDon;
    private javax.swing.JMenuItem mniQLKhuVuc;
    private javax.swing.JMenuItem mniQLMenu;
    private javax.swing.JMenuItem mniQLTaiKhoan;
    private javax.swing.JMenuItem mniQLThongKe;
    private javax.swing.JMenuItem mniSuKien;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JPanel pnHome;
    // End of variables declaration//GEN-END:variables
}

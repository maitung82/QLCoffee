/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.DanhMucDAO;
import DAO.MonAnDAO;
import HanhDong.QLMonAn;
import Helper.HanhDong;
import java.awt.GridBagConstraints;
import MiniForm.HoaDonTT;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import MiniForm.MniQLMonAn;
import MiniForm.MonAnBH;
import MiniForm.ThemMonAn;
import model.DanhMuc;
import model.MonAn;

/**
 *
 * @author CHIEN
 */
public class QLMenu extends javax.swing.JPanel {

    DefaultComboBoxModel comBoDanhMuc;
    DanhMucDAO DMDUCDao = new DanhMucDAO();
    MonAnDAO MADUCDao = new MonAnDAO();
    //
    List<MonAn> lstMonAn = new ArrayList<>();

    /**
     * Creates new form QLMenu
     */
    public QLMenu() {
        initComponents();
        init();
    }

    void init() {
        comBoDanhMuc = (DefaultComboBoxModel) cbxDanhMuc.getModel();
        loadDataToComBoDM();
        HienMon();
        khoiTaoComponent();
    }

    //khoi tạo Component
    public void khoiTaoComponent() {
        QLMonAn.cbxDanhMuc = cbxDanhMuc;
        QLMonAn.btnThemDM = btnThemDM;
        QLMonAn.btnThemMon = btnThemMon;
        QLMonAn.btnXacNhan = btnXacNhan;
        QLMonAn.btnXoaDM = btnXoaDM;
        QLMonAn.pnMon = pnMon;
    }
    //load combo danh mục

    public void loadDataToComBoDM() {
        comBoDanhMuc = (DefaultComboBoxModel) cbxDanhMuc.getModel();
        DMDUCDao.LoadDataToComBoDanhMuc(comBoDanhMuc);
    }
    //
    //hien mon
    GridBagConstraints gbc = new GridBagConstraints();

    public void HienMon() {
        pnMon.removeAll();
        lstMonAn = null;
        lstMonAn = MADUCDao.getListMonAn();
        DanhMuc dm = (DanhMuc) comBoDanhMuc.getElementAt(cbxDanhMuc.getSelectedIndex());
        gbc.insets = new Insets(20, 20, 20, 20);
        int x = 0, y = 0;
        if (dm != null) {
            for (int i = 0; i < lstMonAn.size(); i++) {
                MonAn MA = lstMonAn.get(i);
                gbc.gridx = x;
                gbc.gridy = y;

                if (dm.getTenDanhMuc().equalsIgnoreCase("Tất cả các món")) {
                    ++x;
                    if (x % 5 == 0) {
                        x = 0;
                        ++y;
                    }
                    MniQLMonAn mni = new MniQLMonAn(MA);
                    pnMon.add(mni, gbc);
                } else {

                    if (dm.getMaDanhMuc().equals(MA.getMaDanhMuc())) {
                        ++x;
                        if (x % 4 == 0) {
                            x = 0;
                            ++y;
                        }
                        MniQLMonAn mni = new MniQLMonAn(MA);
                        pnMon.add(mni, gbc);
                    }
                }

                pnMon.validate();
                pnMon.repaint();
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnQLMenu = new javax.swing.JPanel();
        cbxDanhMuc = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnMon = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnThemDM = new javax.swing.JButton();
        btnXoaDM = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnXacNhan = new javax.swing.JButton();
        btnThemMon = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setLayout(new java.awt.GridLayout(1, 0));

        pnQLMenu.setBackground(new java.awt.Color(107, 70, 52));
        pnQLMenu.setMaximumSize(new java.awt.Dimension(1600, 900));
        pnQLMenu.setMinimumSize(new java.awt.Dimension(1600, 900));
        pnQLMenu.setPreferredSize(new java.awt.Dimension(1600, 900));

        cbxDanhMuc.setBackground(new java.awt.Color(255, 204, 204));
        cbxDanhMuc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxDanhMuc.setForeground(new java.awt.Color(107, 70, 52));
        cbxDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh mục", "trà sữa" }));
        cbxDanhMuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDanhMucItemStateChanged(evt);
            }
        });
        cbxDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDanhMucActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(212, 181, 152));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        pnMon.setBackground(new java.awt.Color(212, 181, 152));
        pnMon.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(pnMon);

        jPanel2.add(jScrollPane1);

        jPanel4.setBackground(new java.awt.Color(107, 70, 52));
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        btnThemDM.setBackground(new java.awt.Color(126, 199, 47));
        btnThemDM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemDM.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/them.png"))); // NOI18N
        btnThemDM.setText("Thêm danh mục");
        btnThemDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDMActionPerformed(evt);
            }
        });
        jPanel4.add(btnThemDM);

        btnXoaDM.setBackground(new java.awt.Color(204, 0, 0));
        btnXoaDM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaDM.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/huy.png"))); // NOI18N
        btnXoaDM.setText("Xóa danh mục");
        btnXoaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDMActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoaDM);

        jPanel5.setBackground(new java.awt.Color(107, 70, 52));
        jPanel5.setLayout(new java.awt.GridLayout(1, 3, 25, 20));

        btnXacNhan.setBackground(new java.awt.Color(29, 120, 115));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dangNhap.png"))); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        jPanel5.add(btnXacNhan);

        btnThemMon.setBackground(new java.awt.Color(126, 199, 47));
        btnThemMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemMon.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/them.png"))); // NOI18N
        btnThemMon.setText("Thêm món");
        btnThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnQLMenuLayout = new javax.swing.GroupLayout(pnQLMenu);
        pnQLMenu.setLayout(pnQLMenuLayout);
        pnQLMenuLayout.setHorizontalGroup(
            pnQLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLMenuLayout.createSequentialGroup()
                .addGroup(pnQLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQLMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnQLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnQLMenuLayout.createSequentialGroup()
                                .addComponent(cbxDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 697, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnQLMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1093, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnQLMenuLayout.setVerticalGroup(
            pnQLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnQLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxDanhMuc)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnQLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(pnQLMenu);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDanhMucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDanhMucActionPerformed

    private void btnThemDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDMActionPerformed
        // TODO add your handling code here:
        String tenDM = JOptionPane.showInputDialog(this, "Nhập tên danh mục");
        if (tenDM.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên danh mục");
        } else {
            if (DMDUCDao.selectListDanhMucTrungTen(tenDM) != null) {
                JOptionPane.showMessageDialog(this, "Trùng tên danh mục");
            } else {
                try {
                    DMDUCDao.insertDanhMuc(tenDM);
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    DMDUCDao.LoadDataToComBoDanhMuc(comBoDanhMuc);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Thêm lỗi");
                }
            }
        }
    }//GEN-LAST:event_btnThemDMActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        ManHinhBatDau bt = new ManHinhBatDau();
        GridLayout grl = new GridLayout();
        pnQLMenu.setLayout(grl);
        pnQLMenu.removeAll();
        pnQLMenu.add(bt);
        pnQLMenu.validate();
        pnQLMenu.repaint();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonActionPerformed
        // TODO add your handling code here:

        ThemMonAn tm = new ThemMonAn();
        tm.setVisible(true);

    }//GEN-LAST:event_btnThemMonActionPerformed

    private void cbxDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDanhMucItemStateChanged
        // TODO add your handling code here:
        DanhMuc dm = (DanhMuc) comBoDanhMuc.getElementAt(cbxDanhMuc.getSelectedIndex());
        QLMonAn.dm = dm;
        HienMon();
    }//GEN-LAST:event_cbxDanhMucItemStateChanged

    private void btnXoaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDMActionPerformed
        // TODO add your handling code here:
        comBoDanhMuc = (DefaultComboBoxModel) cbxDanhMuc.getModel();
        DanhMuc DM = (DanhMuc) comBoDanhMuc.getElementAt(cbxDanhMuc.getSelectedIndex());
        if (MADUCDao.findMonByMaDM(DM.getMaDanhMuc()) != null) {
            JOptionPane.showMessageDialog(this, "Danh mục đang còn món không thể xóa");
        } else {
            try {
                DMDUCDao.updateDanhMucVeAn(DM.getMaDanhMuc());
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                DMDUCDao.LoadDataToComBoDanhMuc(comBoDanhMuc);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi xóa");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnXoaDMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemDM;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoaDM;
    private javax.swing.JComboBox<String> cbxDanhMuc;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnMon;
    private javax.swing.JPanel pnQLMenu;
    // End of variables declaration//GEN-END:variables
}
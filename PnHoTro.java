                                
package UserInterFace;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import UserInterFace.AccountControl;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PnHoTro extends javax.swing.JPanel {
    public static Connection getJDBConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://LAPTOP-SA3UVTL4\\SQLEXPRESS:1433;databaseName=managercenntergaming;user=sa;password=1234;encrypt=true;trustServerCertificate=true");    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public PnHoTro() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        hienthitrangthai = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        may2 = new javax.swing.JButton();
        may4 = new javax.swing.JButton();
        may5 = new javax.swing.JButton();
        may6 = new javax.swing.JButton();
        may7 = new javax.swing.JButton();
        may8 = new javax.swing.JButton();
        may9 = new javax.swing.JButton();
        may10 = new javax.swing.JButton();
        may11 = new javax.swing.JButton();
        may3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hienthisomay = new javax.swing.JLabel();
        may1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        hienthitrangthaimay = new javax.swing.JLabel();
        hienthitrangthiamay2 = new javax.swing.JLabel();

        jButton7.setText("jButton7");

        jLabel13.setText("jLabel13");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        hienthitrangthai.setBackground(new java.awt.Color(255, 255, 255));
        hienthitrangthai.setLabelFor(hienthitrangthai);
        hienthitrangthai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hienthitrangthai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Đóng Ứng Dụng");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 150, -1));

        jButton2.setText("Đóng Tất Cả Ứng Dụng");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 150, -1));

        jButton3.setText("Điều Khiển Từ Xa");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 150, -1));

        jButton4.setText("Nạp Tiền Tài Khoản");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 150, -1));

        jButton5.setText("Mở Máy Từ Xa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 150, -1));

        jButton6.setText("Tắt Máy Từ Xa");
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 150, -1));

        jButton8.setText("Khóa Máy");
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 150, -1));

        jButton9.setText("Tắt Âm Thanh Của Máy");
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 150, -1));

        jLabel1.setText("Máy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 32, -1));

        may2.setBackground(new java.awt.Color(51, 255, 51));
        may2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                may2ComponentRemoved(evt);
            }
        });
        may2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may2ActionPerformed(evt);
            }
        });
        add(may2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, 50));

        may4.setBackground(new java.awt.Color(51, 255, 0));
        may4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may4ActionPerformed(evt);
            }
        });
        add(may4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 60, 50));

        may5.setBackground(new java.awt.Color(0, 255, 0));
        may5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may5ActionPerformed(evt);
            }
        });
        add(may5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 60, 50));

        may6.setBackground(new java.awt.Color(255, 255, 0));
        may6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may6ActionPerformed(evt);
            }
        });
        add(may6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 60, 50));

        may7.setBackground(new java.awt.Color(51, 255, 0));
        may7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may7ActionPerformed(evt);
            }
        });
        add(may7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 60, 50));

        may8.setBackground(new java.awt.Color(51, 255, 0));
        may8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may8ActionPerformed(evt);
            }
        });
        add(may8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 60, 50));

        may9.setBackground(new java.awt.Color(255, 255, 0));
        may9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may9ActionPerformed(evt);
            }
        });
        add(may9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 60, 50));

        may10.setBackground(new java.awt.Color(255, 255, 51));
        may10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may10ActionPerformed(evt);
            }
        });
        add(may10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 60, 50));

        may11.setBackground(new java.awt.Color(51, 255, 0));
        may11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterFace/icon.png"))); // NOI18N
        may11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may11ActionPerformed(evt);
            }
        });
        add(may11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 60, 50));

        may3.setBackground(new java.awt.Color(51, 255, 0));
        may3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\icon.png")); // NOI18N
        may3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may3ActionPerformed(evt);
            }
        });
        add(may3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 60, 50));

        jLabel2.setText("Máy 1");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Máy 2");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel4.setText("Máy 3");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel5.setText("Máy 4");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel6.setText("Máy 5");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel7.setText("Máy 6");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel8.setText("Máy 7");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel9.setText("Máy 8");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        jLabel10.setText("Máy 9");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        jLabel11.setText("Máy 10");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        jLabel12.setText("Máy 11");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, -1, -1));
        add(hienthisomay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 20));

        may1.setBackground(new java.awt.Color(255, 0, 0));
        may1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\icon.png")); // NOI18N
        may1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        may1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                may1ActionPerformed(evt);
            }
        });
        add(may1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 50));
        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 460, -1));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hienthitrangthaimay, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hienthitrangthiamay2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hienthitrangthaimay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(hienthitrangthiamay2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 370, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void may4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may4ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("4");
        hienthitrangthaimay.setText("Máy 4: ĐANG HOẠT ĐỘNG");
    }//GEN-LAST:event_may4ActionPerformed

    private void may2ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_may2ComponentRemoved
        // TODO add your handling code here:
        hienthisomay.setText("1");
    }//GEN-LAST:event_may2ComponentRemoved

    private void may3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may3ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText(" 3");
        //may3.setBackground(Color.RED);
        //may3.setVisible(true);
       // may3.setOpaque(true);
        // Gọi repaint để hiển thị màu ngay lập tức
        may3.repaint();
        hienthitrangthaimay.setText("Máy 3: ĐANG HOẠT ĐỘNG");
    
    }//GEN-LAST:event_may3ActionPerformed

    private void may2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may2ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("2");
        hienthitrangthaimay.setText("Máy 2: ĐANG HOẠT ĐỘNG");
       //hienthitrangthiamay2.setText("Cần Nhân Viên Đến Hỗ Trợ");
    }//GEN-LAST:event_may2ActionPerformed

    private void may5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may5ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("5");
        hienthitrangthaimay.setText("Máy 5: ĐANG HOẠT ĐỘNG");
    }//GEN-LAST:event_may5ActionPerformed

    private void may6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may6ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("6");
        hienthitrangthaimay.setText("Máy 6: CHƯA HOẠT ĐỘNG");
    }//GEN-LAST:event_may6ActionPerformed

    private void may7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may7ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("7");
         hienthitrangthaimay.setText("Máy 7: ĐANG HOẠT ĐỘNG");
    }//GEN-LAST:event_may7ActionPerformed

    private void may8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may8ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("8");
          hienthitrangthaimay.setText("Máy 8: ĐANG HOẠT ĐỘNG");
    }//GEN-LAST:event_may8ActionPerformed

    private void may9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may9ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("9");
        hienthitrangthaimay.setText("Máy 9: CHƯA HOẠT ĐỘNG");
    }//GEN-LAST:event_may9ActionPerformed

    private void may10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may10ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("10");
        hienthitrangthaimay.setText("Máy 10: CHƯA HOẠT ĐỘNG");
    }//GEN-LAST:event_may10ActionPerformed

    private void may11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may11ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("11");
          hienthitrangthaimay.setText("Máy 11: ĐANG HOẠT ĐỘNG");
    }//GEN-LAST:event_may11ActionPerformed

    private void may1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_may1ActionPerformed
        // TODO add your handling code here:
        hienthisomay.setText("1");
       // banghienthi.setText("MÁY LỖI CẦN NHÂN VIÊN ĐẾN HỖ TRỢ");
       hienthitrangthaimay.setText("Máy 1: GẶP LỖI");
       hienthitrangthiamay2.setText("Cần Nhân Viên Đến Hỗ Trợ");
                
    }//GEN-LAST:event_may1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hienthisomay;
    private javax.swing.JLabel hienthitrangthai;
    private javax.swing.JLabel hienthitrangthaimay;
    private javax.swing.JLabel hienthitrangthiamay2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton may1;
    private javax.swing.JButton may10;
    private javax.swing.JButton may11;
    private javax.swing.JButton may2;
    private javax.swing.JButton may3;
    private javax.swing.JButton may4;
    private javax.swing.JButton may5;
    private javax.swing.JButton may6;
    private javax.swing.JButton may7;
    private javax.swing.JButton may8;
    private javax.swing.JButton may9;
    // End of variables declaration//GEN-END:variables

    private Icon createColoredIcon(Color iconColor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group10.hospitalmanagement.Main;

/**
 *
 * @author Raj
 */
public class hospitalMenu extends javax.swing.JFrame {

    /**
     * Creates new form Hospital
     */
    public hospitalMenu() {
        initComponents();
        setSize(1280,720);
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
        recepLogin = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        docLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        recepLogin.setBackground(new java.awt.Color(102, 102, 102));
        recepLogin.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        recepLogin.setForeground(new java.awt.Color(255, 255, 255));
        recepLogin.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\front_desk_64px.png")); // NOI18N
        recepLogin.setText("Receptionist");
        recepLogin.setBorderPainted(false);
        recepLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepLoginActionPerformed(evt);
            }
        });
        jPanel1.add(recepLogin);
        recepLogin.setBounds(890, 300, 260, 120);

        adminLogin.setBackground(new java.awt.Color(102, 102, 102));
        adminLogin.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(255, 255, 255));
        adminLogin.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\microsoft_admin_64px.png")); // NOI18N
        adminLogin.setText("Admin");
        adminLogin.setBorderPainted(false);
        adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginActionPerformed(evt);
            }
        });
        jPanel1.add(adminLogin);
        adminLogin.setBounds(350, 300, 260, 120);

        docLogin.setBackground(new java.awt.Color(102, 102, 102));
        docLogin.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        docLogin.setForeground(new java.awt.Color(255, 255, 255));
        docLogin.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\doctors_bag_64px.png")); // NOI18N
        docLogin.setText("Doctor");
        docLogin.setBorderPainted(false);
        docLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docLoginActionPerformed(evt);
            }
        });
        jPanel1.add(docLogin);
        docLogin.setBounds(620, 300, 260, 120);

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1280, 60);

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 660, 1280, 60);

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        jLabel2.setBackground(new java.awt.Color(51, 153, 0));
        jLabel2.setFont(new java.awt.Font("Aeroport", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Login As  ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 110, 190, 70);

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));

        jLabel3.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("to");

        jLabel4.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome");

        jLabel5.setFont(new java.awt.Font("Aeroport", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hospital");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 220, 220, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docLoginActionPerformed
        UsernamePasswordsDOC doc = new UsernamePasswordsDOC();
        doctorLogin dl = new doctorLogin(doc.getLoginInfoDOC());
        dispose();
        
    }//GEN-LAST:event_docLoginActionPerformed

    private void recepLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepLoginActionPerformed
        UsernamePasswordRECEP rec = new UsernamePasswordRECEP();
        recepLogin recLog = new recepLogin(rec.getLoginInfoRecep());
        dispose();
    }//GEN-LAST:event_recepLoginActionPerformed

    private void adminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginActionPerformed
        UsernamePasswordsADMIN  up = new UsernamePasswordsADMIN();
        adminLogin lp = new adminLogin(up.getLoginInfo());
        dispose();
    }//GEN-LAST:event_adminLoginActionPerformed

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
            java.util.logging.Logger.getLogger(hospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospitalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospitalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLogin;
    private javax.swing.JButton docLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton recepLogin;
    // End of variables declaration//GEN-END:variables
}

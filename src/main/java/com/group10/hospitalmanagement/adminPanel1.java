/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group10.hospitalmanagement;

/**
 *
 * @author Raj
 */
public class adminPanel1 extends javax.swing.JFrame {

    /**
     * Creates new form adminPanel1
     */
    public adminPanel1() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 620, 1280, 100);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jButton5.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\icons8-logout-rounded-up-64.png")); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1200, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1280, 100);

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\icons8-doctor-male-48.png")); // NOI18N
        jButton3.setText("Doctor Info");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(650, 280, 200, 110);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\icons8-patient-oxygen-mask-48.png")); // NOI18N
        jButton2.setText("Patient Info");
        jButton2.setActionCommand("Patient");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(430, 280, 200, 110);

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\icons8-nurse-48.png")); // NOI18N
        jButton4.setText("Nurse Info");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(430, 410, 200, 110);

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\icons8-front-desk-48.png")); // NOI18N
        jButton1.setText("Receptionist Info");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 410, 200, 110);

        jLabel3.setFont(new java.awt.Font("Couture", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("admin panel");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 200, 1280, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\icons8-admin-settings-male-100.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 110, 100, 90);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        patientPanel patPan = new patientPanel();
        patPan.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        nursePanel nurPan = new nursePanel();
        nurPan.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        doctorPanel docPan = new doctorPanel();
        docPan.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        recepPanel recepPan = new recepPanel();
        recepPan.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

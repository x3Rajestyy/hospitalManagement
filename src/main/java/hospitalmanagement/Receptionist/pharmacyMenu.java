/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement.Receptionist;

import hospitalmanagement.Doctor.*;
import hospitalmanagement.Admin.patientPanel;
import hospitalmanagement.Main.hospitalMenu;

/**
 *
 * @author Raj
 */
public class pharmacyMenu extends javax.swing.JFrame {

    /**
     * Creates new form adminPanel1
     */
    public pharmacyMenu() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jcmbNameTablets = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jtxtRef = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtxtDose = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtNumberTablets = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtIssuedDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtExpDate = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 232, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(105, 203, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 620, 530, 100);

        jPanel3.setBackground(new java.awt.Color(105, 203, 255));

        jLabel3.setFont(new java.awt.Font("Couture", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("pharmacy MENU");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 530, 102);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 110, 100, 90);

        jLabel23.setFont(new java.awt.Font("Aeroport", 1, 18)); // NOI18N
        jLabel23.setText("Name of Tablets:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(70, 190, 149, 26);

        jcmbNameTablets.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbNameTablets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make a Selection", "Ibuprofen", "Co-codamol", "Paracetamol", "Amlodipine" }));
        jcmbNameTablets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbNameTabletsActionPerformed(evt);
            }
        });
        jPanel1.add(jcmbNameTablets);
        jcmbNameTablets.setBounds(270, 190, 210, 28);

        jLabel22.setFont(new java.awt.Font("Aeroport", 1, 18)); // NOI18N
        jLabel22.setText("Reference No.");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(70, 230, 126, 26);

        jtxtRef.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jtxtRef);
        jtxtRef.setBounds(270, 230, 210, 28);

        jLabel24.setFont(new java.awt.Font("Aeroport", 1, 18)); // NOI18N
        jLabel24.setText("Dose (mg):");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(70, 270, 94, 26);

        jtxtDose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jtxtDose);
        jtxtDose.setBounds(270, 270, 210, 28);

        jLabel4.setFont(new java.awt.Font("Aeroport", 1, 18)); // NOI18N
        jLabel4.setText("Number of Tablets:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 310, 169, 26);

        jtxtNumberTablets.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jtxtNumberTablets);
        jtxtNumberTablets.setBounds(270, 310, 210, 28);

        jLabel6.setFont(new java.awt.Font("Aeroport", 1, 18)); // NOI18N
        jLabel6.setText("Issued Date:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 390, 109, 26);

        jtxtIssuedDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jtxtIssuedDate);
        jtxtIssuedDate.setBounds(270, 390, 210, 28);

        jLabel7.setFont(new java.awt.Font("Aeroport", 1, 18)); // NOI18N
        jLabel7.setText("Exp Date:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 430, 83, 26);

        jtxtExpDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jtxtExpDate);
        jtxtExpDate.setBounds(270, 430, 210, 28);

        logoutButton.setBackground(new java.awt.Color(105, 203, 255));
        logoutButton.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        logoutButton.setText("Back");
        logoutButton.setBorderPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton);
        logoutButton.setBounds(410, 550, 111, 58);

        priceField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(priceField);
        priceField.setBounds(270, 470, 210, 30);

        jLabel2.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        jLabel2.setText("Price");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 470, 200, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbNameTabletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbNameTabletsActionPerformed
        if (jcmbNameTablets.getSelectedItem().equals("Ibuprofen"))
        {
            jtxtRef.setText("Ibu8568959");
            jtxtDose.setText("2");
            jtxtNumberTablets.setText("32");
            jtxtIssuedDate.setText("06/05/2018");
            jtxtExpDate.setText("04/05/2023");
           

        }

        else if (jcmbNameTablets.getSelectedItem().equals("Co-codamol"))
        {
            jtxtRef.setText("COCO6758940");
            jtxtDose.setText("500");
            jtxtNumberTablets.setText("30");
            jtxtIssuedDate.setText("06/05/2018");
            jtxtExpDate.setText("04/12/2023");

        }

        else if (jcmbNameTablets.getSelectedItem().equals("Paracetamol"))
        {
            jtxtRef.setText("Pr01729214");
            jtxtDose.setText("500");
            jtxtNumberTablets.setText("16");
            jtxtIssuedDate.setText("07/05/2018");
            jtxtExpDate.setText("04/05/2023");

        }

        else if (jcmbNameTablets.getSelectedItem().equals("Amlodipine"))
        {
            jtxtRef.setText("Am05875");
            jtxtDose.setText("5");
            jtxtNumberTablets.setText("28");
            jtxtIssuedDate.setText("06/05/2018");
            jtxtExpDate.setText("04/05/2023");


        }
        //Cephalexin
        else if (jcmbNameTablets.getSelectedItem().equals("Amoxicillin"))
        {
            jtxtRef.setText("Am058439");
            jtxtDose.setText("4");
            jtxtNumberTablets.setText("12");
            jtxtIssuedDate.setText("03/23/2019");
            jtxtExpDate.setText("10/15/2024");

        }
        
        else if (jcmbNameTablets.getSelectedItem().equals("Cephalexin"))
        {
            jtxtRef.setText("Ce93281");
            jtxtDose.setText("4");
            jtxtNumberTablets.setText("12");
            jtxtIssuedDate.setText("12/12/2018");
            jtxtExpDate.setText("11/15/2024");

        }
        
        else if (jcmbNameTablets.getSelectedItem().equals("Hydrochlorothiazide"))
        {
            jtxtRef.setText("Hcz29311");
            jtxtDose.setText("");
            jtxtNumberTablets.setText("100");
            jtxtIssuedDate.setText("02/15/2019");
            jtxtExpDate.setText("06/25/2024");

        }
        
        else if (jcmbNameTablets.getSelectedItem().equals("Make a Selection"))
        {
            jtxtRef.setText("");
            jtxtDose.setText("");
            jtxtNumberTablets.setText("");
            jtxtIssuedDate.setText("");
            jtxtExpDate.setText("");

        }

    }//GEN-LAST:event_jcmbNameTabletsActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        billingMenu recMen = new billingMenu();
        recMen.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcmbNameTablets;
    private javax.swing.JTextField jtxtDose;
    private javax.swing.JTextField jtxtExpDate;
    private javax.swing.JTextField jtxtIssuedDate;
    private javax.swing.JTextField jtxtNumberTablets;
    private javax.swing.JTextField jtxtRef;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}

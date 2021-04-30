/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group10.hospitalmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raj
 */
public class recepPanel extends javax.swing.JFrame {
    
    /**
     * Creates new form patientPanel
     */
    public recepPanel() {
        initComponents();
        
        File file = new File("recepData.txt");
        if(file.length() == 0){
            //do nothing
        } else {
            setTableData();
        }
    }
    
    private void setTableData(){
        File file = new File("recepData.txt");
        try{
        FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)recepTable.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
        }catch(FileNotFoundException ex){
            Logger.getLogger(recepPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        recepTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\front_desk_100px.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 180, 100, 100);

        jLabel3.setFont(new java.awt.Font("Couture", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RECEPTIONIST list");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 270, 1280, 80);
        getContentPane().add(canvas1);
        canvas1.setBounds(601, 356, 0, 0);

        recepTable.setBackground(new java.awt.Color(255, 255, 204));
        recepTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Joined Date", "ID", "Name", "Gender", "Age", "Address", "Contact No.", "Marital Status", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recepTable.setGridColor(new java.awt.Color(0, 0, 0));
        recepTable.setShowGrid(false);
        jScrollPane1.setViewportView(recepTable);
        if (recepTable.getColumnModel().getColumnCount() > 0) {
            recepTable.getColumnModel().getColumn(0).setResizable(false);
            recepTable.getColumnModel().getColumn(1).setResizable(false);
            recepTable.getColumnModel().getColumn(2).setResizable(false);
            recepTable.getColumnModel().getColumn(3).setResizable(false);
            recepTable.getColumnModel().getColumn(4).setResizable(false);
            recepTable.getColumnModel().getColumn(5).setResizable(false);
            recepTable.getColumnModel().getColumn(6).setResizable(false);
            recepTable.getColumnModel().getColumn(7).setResizable(false);
            recepTable.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 1250, 210);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 640, 1280, 60);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1280, 60);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\updatesmol.png")); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1180, 550, 80, 40);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("E:\\Users\\Raj\\Documents\\NetBeansProjects\\hospitalManagement\\src\\main\\java\\com\\group10\\hospitalmanagement\\pictures\\smallback.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1090, 550, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 700);

        jMenu4.setText("Receptionist Tools");
        jMenu4.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jMenuItem1.setText("Add Receptionist");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jMenuItem2.setText("Delete Receptionist");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        addRecep addR = new addRecep();
        addR.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        adminPanel1 adminPanel = new adminPanel1();
        adminPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filePath = "recepData.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < recepTable.getRowCount(); i++){//rows
                for(int j = 0; j < recepTable.getColumnCount(); j++){//columns
                    bw.write(recepTable.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(doctorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recepTable;
    // End of variables declaration//GEN-END:variables
}

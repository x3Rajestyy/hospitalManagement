/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement.Doctor;

import hospitalmanagement.Admin.*;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raj
 */
public class checkDoctor extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form patientPanel
     */
    public checkDoctor() {
        initComponents();
        
        setSize(1290,766);
        
        File file = new File("doctorData.txt");
        if(file.length() == 0){
            //do nothing
        } else {
            setTableData();
        }
    }
   
    private void setTableData(){
        File file = new File("doctorData.txt");
        try{
        FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel model = (DefaultTableModel) docTable.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                
                String line = lines[i].toString().trim();
                String[] dataRow = line.split(" ");
                for(int j = 0; j < dataRow.length; j++){
                    dataRow[j] = dataRow[j].replaceAll("_", " ");
                }
                model.addRow(dataRow);
            }
        }catch(FileNotFoundException ex){
            Logger.getLogger(checkDoctor.class.getName()).log(Level.SEVERE, null, ex);
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
        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 180, 100, 100);
        getContentPane().add(canvas1);
        canvas1.setBounds(601, 356, 0, 0);

        docTable.setBackground(new java.awt.Color(255, 255, 204));
        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Join Date", "First Name", "Last Name", "Gender", "Age", "Address", "Contact No.", "Department", "Marital Status", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        docTable.setGridColor(new java.awt.Color(0, 0, 0));
        docTable.setShowGrid(false);
        docTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(docTable);
        if (docTable.getColumnModel().getColumnCount() > 0) {
            docTable.getColumnModel().getColumn(0).setResizable(false);
            docTable.getColumnModel().getColumn(1).setResizable(false);
            docTable.getColumnModel().getColumn(2).setResizable(false);
            docTable.getColumnModel().getColumn(3).setResizable(false);
            docTable.getColumnModel().getColumn(4).setResizable(false);
            docTable.getColumnModel().getColumn(5).setResizable(false);
            docTable.getColumnModel().getColumn(6).setResizable(false);
            docTable.getColumnModel().getColumn(7).setResizable(false);
            docTable.getColumnModel().getColumn(8).setResizable(false);
            docTable.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 1260, 510);

        jPanel1.setBackground(new java.awt.Color(187, 232, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(105, 203, 255));
        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 640, 1280, 80);

        jPanel2.setBackground(new java.awt.Color(105, 203, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Couture", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Doctor list");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1280, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1280, 60);

        jButton2.setBackground(new java.awt.Color(105, 203, 255));
        jButton2.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1190, 70, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1340, 780);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        doctorMenu docmen = new doctorMenu();
        docmen.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JTable docTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

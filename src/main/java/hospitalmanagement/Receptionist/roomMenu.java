/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement.Receptionist;

import hospitalmanagement.Global.*;
import hospitalmanagement.Admin.*;
import hospitalmanagement.Receptionist.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raj
 */
public class roomMenu extends javax.swing.JFrame {

    /**
     * Creates new form patientPanel
     */
    public roomMenu() {
        initComponents();
        setSize(1290, 766);
        File file = new File("roomData.txt");
        if (file.length() == 0) {
            //do nothing
        } else {
            setTableData();
        }
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);

    }

    private void updateTable() {
        try {
            String filePath = "roomData.txt";
            File file = new File(filePath);
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for (int i = 0; i < patTable.getRowCount(); i++) {//rows
                    for (int j = 0; j < patTable.getColumnCount(); j++) {//columns
                        bw.write(patTable.getValueAt(i, j).toString() + " ");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(doctorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            bedID.setText("BED-");
            catBox.setSelectedIndex(0);
            roomNo.setText(null);
            avaBox.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void setDataFromTable(String PatientID, String first, String last, String number, String disease) {

    }

    private void setTableData() {
        File file = new File("roomData.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel model = (DefaultTableModel) patTable.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(roomMenu.class.getName()).log(Level.SEVERE, null, ex);
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

        radioGroup = new javax.swing.ButtonGroup();
        canvas1 = new java.awt.Canvas();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addRoom = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        roomNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bedID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        catBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        avaBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);
        getContentPane().add(canvas1);
        canvas1.setBounds(601, 356, 0, 0);

        jPanel3.setBackground(new java.awt.Color(105, 203, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Couture", 0, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("BED AVAILABILITY");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel14);
        jLabel14.setBounds(0, 0, 1280, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1280, 60);

        jPanel1.setBackground(new java.awt.Color(187, 232, 255));
        jPanel1.setLayout(null);

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

        updateButton.setBackground(new java.awt.Color(105, 203, 255));
        updateButton.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton);
        updateButton.setBounds(500, 150, 150, 70);

        deleteButton.setBackground(new java.awt.Color(105, 203, 255));
        deleteButton.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton);
        deleteButton.setBounds(330, 150, 150, 70);

        patTable.setBackground(new java.awt.Color(255, 255, 204));
        patTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bed ID", "Category", "Room Number", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patTable.setGridColor(new java.awt.Color(0, 0, 0));
        patTable.setShowGrid(false);
        patTable.getTableHeader().setReorderingAllowed(false);
        patTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patTable);
        if (patTable.getColumnModel().getColumnCount() > 0) {
            patTable.getColumnModel().getColumn(0).setResizable(false);
            patTable.getColumnModel().getColumn(1).setResizable(false);
            patTable.getColumnModel().getColumn(2).setResizable(false);
            patTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 640, 410);

        jPanel2.setBackground(new java.awt.Color(105, 203, 255));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 660, 1280, 90);

        addRoom.setBackground(new java.awt.Color(105, 203, 255));
        addRoom.setFont(new java.awt.Font("Aeroport", 0, 36)); // NOI18N
        addRoom.setText("Add Room");
        addRoom.setToolTipText("");
        addRoom.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addRoom.setBorderPainted(false);
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });
        jPanel1.add(addRoom);
        addRoom.setBounds(10, 150, 300, 70);

        jLabel3.setFont(new java.awt.Font("Couture", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Room");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(760, 140, 440, 110);

        roomNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        roomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNoActionPerformed(evt);
            }
        });
        jPanel1.add(roomNo);
        roomNo.setBounds(940, 450, 260, 50);

        jLabel1.setFont(new java.awt.Font("Aeroport", 0, 36)); // NOI18N
        jLabel1.setText("Room No.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(760, 450, 170, 50);

        bedID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bedID.setText("BED-");
        jPanel1.add(bedID);
        bedID.setBounds(940, 270, 260, 50);

        jLabel2.setFont(new java.awt.Font("Aeroport", 0, 36)); // NOI18N
        jLabel2.setText("Bed ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(760, 270, 170, 50);

        jLabel4.setFont(new java.awt.Font("Aeroport", 0, 36)); // NOI18N
        jLabel4.setText("Category");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(760, 360, 170, 50);

        catBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        catBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "ICU", "CCU", "General", "Emergency" }));
        jPanel1.add(catBox);
        catBox.setBounds(940, 360, 260, 50);

        jLabel5.setFont(new java.awt.Font("Aeroport", 0, 30)); // NOI18N
        jLabel5.setText("Availability");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(760, 540, 170, 50);

        avaBox.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        avaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Availability", "Yes", "No" }));
        jPanel1.add(avaBox);
        avaBox.setBounds(940, 540, 260, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        recepMenu remenu = new recepMenu();
        remenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        if (patTable.getSelectedRowCount() == 1) {
            
            String bedIDs = bedID.getText().replaceAll("\\s+", "");
            String catBoxs = catBox.getSelectedItem().toString();
            String roomnum = roomNo.getText().replaceAll("\\s+", "");
            String avaBoxs = avaBox.getSelectedItem().toString();
            
            model.setValueAt(bedIDs,patTable.getSelectedRow(),0);
            model.setValueAt(catBoxs,patTable.getSelectedRow(),1);
            model.setValueAt(roomnum,patTable.getSelectedRow(),2);
            model.setValueAt(avaBoxs,patTable.getSelectedRow(),3);
            
        } else {
            if (patTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a single row for update");
            }
        }
        updateTable();
        JOptionPane.showMessageDialog(this, "Appointment Data Updated Successfully");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) patTable.getModel();
            try {
                int SelectedRowIndex = patTable.getSelectedRow();
                model.removeRow(SelectedRowIndex);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            JOptionPane.showMessageDialog(this, "Appointment Data Deleted Sucessfully");
            updateTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void patTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();

        String bedIDs = model.getValueAt(patTable.getSelectedRow(),0).toString();
        Object catBoxs = model.getValueAt(patTable.getSelectedRow(),1).toString();
        String roomnum = model.getValueAt(patTable.getSelectedRow(),2).toString();
        Object avaBoxs = model.getValueAt(patTable.getSelectedRow(),3).toString();
        
        bedID.setText(bedIDs);
        catBox.setSelectedItem(catBoxs);
        roomNo.setText(roomnum);
        avaBox.setSelectedItem(avaBoxs);
        
        updateButton.setEnabled(true);
        deleteButton.setEnabled(true);
    }//GEN-LAST:event_patTableMouseClicked

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        
        model.insertRow(model.getRowCount(), new Object[] {bedID.getText(),catBox.getSelectedItem().toString(),roomNo.getText(),avaBox.getSelectedItem().toString()});
        
        updateTable();
        JOptionPane.showMessageDialog(this, "Appointment Data Added Successfully");
    }//GEN-LAST:event_addRoomActionPerformed

    private void roomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoom;
    private javax.swing.JComboBox<String> avaBox;
    private javax.swing.JTextField bedID;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox<String> catBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patTable;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JTextField roomNo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement.Global;

import hospitalmanagement.Admin.*;
import hospitalmanagement.Receptionist.roomMenu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Raj
 */
public class pickRoomAvail extends javax.swing.JFrame {
    String PatientID,first,last,address,bedIDs,catBoxs,roomnum;

    
    /**
     * Creates new form patientPanel
     */
    public pickRoomAvail() {
        initComponents();
        setSize(1290,766);
        File file = new File("roomData.txt");
     
        if(file.length() == 0){
            //do nothing
        } else {
            setTableData();
        }
    
        
    }
    
    public void setValues(String PatientID, String first, String last, String address){
        this.PatientID = PatientID;
        this.first = first;
        this.last = last;
        this.address = address;

    }
   
    
    private void updateTable() {
        try {
            String filePath = "roomData.txt";
            File file = new File(filePath);
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for (int i = 0; i < roomTable.getRowCount(); i++) {//rows
                    for (int j = 0; j < roomTable.getColumnCount(); j++) {//columns
                        String placeholder = roomTable.getValueAt(i, j).toString().replaceAll("\\s+", "_");
                        bw.write(placeholder + " ");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(roomMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void setTableData() {
        String path = "roomData.txt";
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel model = (DefaultTableModel) roomTable.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                
                String line = lines[i].toString().trim();
                String[] dataRow = line.split(" ");
                for(int j = 0; j < dataRow.length; j++){
                    dataRow[j] = dataRow[j].replaceAll("_", " ");
                }
                model.addRow(dataRow);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(pickRoomAvail.class.getName()).log(Level.SEVERE, null, ex);
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
        selectButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();

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
        jLabel14.setText("Room list");
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

        selectButton.setBackground(new java.awt.Color(105, 203, 255));
        selectButton.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        selectButton.setText("Select");
        selectButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectButton.setBorderPainted(false);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectButton);
        selectButton.setBounds(1120, 580, 150, 70);

        jPanel2.setBackground(new java.awt.Color(105, 203, 255));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 660, 1280, 60);

        roomTable.setBackground(new java.awt.Color(255, 255, 204));
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
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
        roomTable.setGridColor(new java.awt.Color(0, 0, 0));
        roomTable.setShowGrid(false);
        roomTable.getTableHeader().setReorderingAllowed(false);
        roomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roomTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 1250, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        patientListRecep backPanel = new patientListRecep();
        backPanel.fromRooms();
        backPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) roomTable.getModel();
        String date = JOptionPane.showInputDialog(this,"Date Admitted(MM/dd/YYYY)");
        String available = model.getValueAt(roomTable.getSelectedRow(), 3).toString();
        if(available.equals("Yes")){
            String avail = "No";
            model.setValueAt(avail,roomTable.getSelectedRow(), 3);
            updateTable();
            this.dispose();
                roomsOccupied occ = new roomsOccupied();
                occ.setData(PatientID,first,last,address,bedIDs,catBoxs,date);
                occ.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Pick an available room");
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void roomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) roomTable.getModel();

        bedIDs = model.getValueAt(roomTable.getSelectedRow(),0).toString();
        catBoxs = model.getValueAt(roomTable.getSelectedRow(),1).toString();
    }//GEN-LAST:event_roomTableMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JTable roomTable;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
}

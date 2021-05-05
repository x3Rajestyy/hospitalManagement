/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement.Global;

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
public class appointmentListRecep extends javax.swing.JFrame {
    


    
    
    /**
     * Creates new form patientPanel
     */
    public appointmentListRecep() {
        initComponents();
        setSize(1290,766);
        File file = new File("appointmentData.txt");
        if(file.length() == 0){
            //do nothing
        } else {
            setTableData();
        }
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);
        
    }
    
    private void updateTable(){
        try{
        String filePath = "appointmentData.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < patTable.getRowCount(); i++){//rows
                for(int j = 0; j < patTable.getColumnCount(); j++){//columns
                    bw.write(patTable.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(appointmentListRecep.class.getName()).log(Level.SEVERE, null, ex);
        }
        patientField.setText(null);
        appDate.setText("MM/dd/YYYY");
        fNameField.setText(null);
        lNameField.setText(null);
        conField.setText(null);
        disField.setText(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void setDataFromTable(String PatientID, String first, String last, String number, String disease){
        patientField.setText(PatientID);
        fNameField.setText(first);
        lNameField.setText(last);
        conField.setText(number);
        disField.setText(disease);
    }
    
    public void setDataFromDoc(String doctorFName, String doctorLName){
        docField.setText(doctorFName+"_"+doctorLName);
    }
    
    private void setTableData(){
        File file = new File("appointmentData.txt");
        try{
        FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)patTable.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
        }catch(FileNotFoundException ex){
            Logger.getLogger(appointmentListRecep.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        conField = new javax.swing.JTextField();
        addPatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        disField = new javax.swing.JTextField();
        selectButton = new javax.swing.JButton();
        appDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        docField = new javax.swing.JTextField();

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
        jLabel14.setText("Appointment list");
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
        updateButton.setBounds(1050, 260, 150, 70);

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
        deleteButton.setBounds(870, 260, 150, 70);

        patTable.setBackground(new java.awt.Color(255, 255, 204));
        patTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Doctor", "Appointment Date", "First Name", "Last Name", "Contact No.", "Disease"
            }
        ));
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
            patTable.getColumnModel().getColumn(3).setResizable(false);
            patTable.getColumnModel().getColumn(4).setResizable(false);
            patTable.getColumnModel().getColumn(5).setResizable(false);
            patTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 440, 1260, 210);

        jPanel2.setBackground(new java.awt.Color(105, 203, 255));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 660, 1280, 90);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Contact No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 250, 120, 30);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Doctor");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 280, 80, 30);

        fNameField.setEnabled(false);
        jPanel1.add(fNameField);
        fNameField.setBounds(570, 130, 220, 30);

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Last Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 190, 80, 30);

        lNameField.setEnabled(false);
        jPanel1.add(lNameField);
        lNameField.setBounds(570, 190, 220, 30);

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Patient ID");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 220, 90, 30);

        patientField.setEnabled(false);
        jPanel1.add(patientField);
        patientField.setBounds(210, 220, 220, 30);

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Appointment Date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 160, 130, 30);

        conField.setEnabled(false);
        jPanel1.add(conField);
        conField.setBounds(570, 250, 220, 30);

        addPatient.setBackground(new java.awt.Color(105, 203, 255));
        addPatient.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        addPatient.setText("Add Appointment");
        addPatient.setToolTipText("");
        addPatient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addPatient.setBorderPainted(false);
        addPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientActionPerformed(evt);
            }
        });
        jPanel1.add(addPatient);
        addPatient.setBounds(1050, 160, 150, 70);

        jLabel3.setFont(new java.awt.Font("Couture", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("add Appointment");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 70, 250, 50);

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Disease");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(470, 310, 80, 30);

        disField.setEnabled(false);
        jPanel1.add(disField);
        disField.setBounds(570, 310, 220, 30);

        selectButton.setBackground(new java.awt.Color(105, 203, 255));
        selectButton.setFont(new java.awt.Font("Aeroport", 0, 18)); // NOI18N
        selectButton.setText("Selection List");
        selectButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectButton.setBorderPainted(false);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectButton);
        selectButton.setBounds(870, 160, 150, 70);

        appDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        appDate.setText("MM/dd/YYYY");
        appDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appDateActionPerformed(evt);
            }
        });
        jPanel1.add(appDate);
        appDate.setBounds(260, 160, 170, 30);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("First Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 130, 80, 30);
        jPanel1.add(docField);
        docField.setBounds(210, 280, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        recepMenu remenu = new recepMenu();
        remenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        if(patTable.getSelectedRowCount() == 1){
            String PatientID = patientField.getText().replaceAll("\\s+", "");
            String doctorName = docField.getText().replaceAll("\\s+", "_");
            String datesField = appDate.getText().replaceAll("\\s+", "");
            String firstName = fNameField.getText().replaceAll("\\s+", "_");
            String lname = lNameField.getText().replaceAll("\\s+", "_");
            String contact = conField.getText().replaceAll("\\s+", "_");
            String disease = disField.getText().replaceAll("\\s+", "_");
            
            model.setValueAt(PatientID, patTable.getSelectedRow(),0);
            model.setValueAt(doctorName, patTable.getSelectedRow(),1);
            model.setValueAt(datesField, patTable.getSelectedRow(),2);
            model.setValueAt(firstName, patTable.getSelectedRow(),3);
            model.setValueAt(lname, patTable.getSelectedRow(),4);
            model.setValueAt(contact, patTable.getSelectedRow(),5);
            model.setValueAt(disease, patTable.getSelectedRow(),6);
        } else {
            if(patTable.getRowCount() == 0){
                JOptionPane.showMessageDialog(this,"Table is empty");
            } else {
                JOptionPane.showMessageDialog(this,"Please select a single row for update");
            }
        }
        updateTable();
        JOptionPane.showMessageDialog(this,"Appointment Data Updated Successfully");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        try {
            int SelectedRowIndex = patTable.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        JOptionPane.showMessageDialog(this,"Appointment Data Deleted Sucessfully");
        updateTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void patTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        
        String PatientID  = patTable.getValueAt(patTable.getSelectedRow(),0).toString();
        String doctorName = patTable.getValueAt(patTable.getSelectedRow(),1).toString();
        String date =  patTable.getValueAt(patTable.getSelectedRow(),2).toString();
        String first = patTable.getValueAt(patTable.getSelectedRow(),3).toString();
        String last = patTable.getValueAt(patTable.getSelectedRow(),4).toString();
        String number = patTable.getValueAt(patTable.getSelectedRow(),5).toString();
        String disease = patTable.getValueAt(patTable.getSelectedRow(),6).toString();
        
        patientField.setText(PatientID);
        docField.setText(doctorName);
        appDate.setText(date);
        fNameField.setText(first);
        lNameField.setText(last);
        conField.setText(number);
        disField.setText(disease);
        updateButton.setEnabled(true);
        deleteButton.setEnabled(true);
    }//GEN-LAST:event_patTableMouseClicked

    private void addPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientActionPerformed
        DefaultTableModel model = (DefaultTableModel) patTable.getModel();
        
        model.insertRow(model.getRowCount(), new Object[]{patientField.getText().replaceAll("\\s+", ""),docField.getText().replaceAll("\\s+", "_"),appDate.getText().replaceAll("\\s+", ""),fNameField.getText().replaceAll("\\s+", "_"),
            lNameField.getText().replaceAll("\\s+", "_"),conField.getText().replaceAll("\\s+", "_"),disField.getText().replaceAll("\\s+", "_")});
        updateTable();
        JOptionPane.showMessageDialog(this,"Appointment Data Added Successfully");
    }//GEN-LAST:event_addPatientActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        patientListRecep plr = new patientListRecep();
        plr.setVisible(true);
        dispose();
    }//GEN-LAST:event_selectButtonActionPerformed

    private void appDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appDateActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatient;
    private javax.swing.JTextField appDate;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField conField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField disField;
    private javax.swing.JTextField docField;
    private javax.swing.JTextField fNameField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lNameField;
    private javax.swing.JTable patTable;
    private javax.swing.JTextField patientField;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

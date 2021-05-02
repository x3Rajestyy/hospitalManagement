/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement.Admin;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Raj
 */
public class addDoctor extends javax.swing.JFrame {
    
    DateFormat  dateFormat = new SimpleDateFormat("MM/dd/YY");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    private String uniqueID,dates,name,gender,age,address,con,dept,marital,email;
    private String username,password;

    /**
     * Creates new form addPatient
     */
    public addDoctor() {
        initComponents();
        
        dateField.setText(" "+ dateFormat.format(date));
    }
    
    private String getSelectedButton(ButtonGroup buttongroup){
        
        for (Enumeration<AbstractButton> buttons = buttongroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }

        }
        return null;
    }
    

    private void writeFile() throws IOException{
        File file = new File("doctorData.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.print(dates + " " + uniqueID + " " + name + " " + gender + " " + age + " " + address + " " + con + " " + dept + " " + marital + " " + email  + "\n");
        pw.close();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        conField = new javax.swing.JTextField();
        disLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        deptComBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        statComBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Doctor");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(0, 0, 630, 510));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 630, 510));
        setMinimumSize(new java.awt.Dimension(630, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(630, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Couture", 0, 18)); // NOI18N
        jLabel1.setText("Add Doctor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(null);

        conField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conFieldActionPerformed(evt);
            }
        });
        jPanel3.add(conField);
        conField.setBounds(84, 349, 186, 28);

        disLabel.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        disLabel.setText("Department:");
        jPanel3.add(disLabel);
        disLabel.setBounds(10, 398, 78, 19);

        jLabel7.setFont(new java.awt.Font("Aeroport", 0, 11)); // NOI18N
        jLabel7.setText("Contact No.");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 355, 59, 15);

        jLabel6.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel6.setText("Address:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 306, 56, 19);

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel3.add(addressField);
        addressField.setBounds(391, 314, 192, 28);
        jPanel3.add(ageField);
        ageField.setBounds(84, 258, 53, 28);

        jLabel5.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel5.setText("Age:");
        jLabel5.setToolTipText("");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 256, 40, 30);

        jLabel4.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel4.setText("Gender: ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 176, 110, 70);

        jRadioButton2.setBackground(new java.awt.Color(204, 255, 204));
        radioButtonGroup.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(80, 200, 190, 23);
        jRadioButton2.getAccessibleContext().setAccessibleDescription("");

        jRadioButton1.setBackground(new java.awt.Color(204, 255, 204));
        radioButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(80, 180, 170, 23);

        jRadioButton3.setBackground(new java.awt.Color(204, 255, 204));
        radioButtonGroup.add(jRadioButton3);
        jRadioButton3.setText("Other");
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(80, 220, 180, 23);
        jPanel3.add(nameField);
        nameField.setBounds(80, 141, 186, 28);

        jLabel3.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel3.setText("Name: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 140, 46, 28);

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setFont(new java.awt.Font("Retroica", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setInheritsPopupMenu(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(393, 393, 90, 30);

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Retroica", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(493, 393, 90, 30);

        jLabel2.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel2.setText("Join Date:");
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 98, 65, 30);

        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        jPanel3.add(dateField);
        dateField.setBounds(80, 99, 186, 30);

        deptComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Dental", "Nutrition", "Gynecology", "Neurology", "Cardiology", "Hematology", "Microbiology", "Radiology", "Surgical", "Optometry" }));
        jPanel3.add(deptComBox);
        deptComBox.setBounds(115, 395, 153, 28);

        jLabel8.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel8.setText("Marital Status:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(315, 103, 92, 23);

        statComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        jPanel3.add(statComBox);
        statComBox.setBounds(427, 101, 156, 28);

        jLabel9.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel9.setText("Email:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(315, 144, 39, 19);
        jPanel3.add(emailField);
        emailField.setBounds(393, 141, 190, 29);

        jLabel10.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel10.setText("Username:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(315, 260, 70, 19);

        jLabel11.setFont(new java.awt.Font("Aeroport", 0, 14)); // NOI18N
        jLabel11.setText("Password:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(315, 306, 67, 19);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(393, 257, 190, 28);
        jPanel3.add(jTextField3);
        jTextField3.setBounds(84, 303, 186, 28);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void conFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        doctorPanel docPanel = new doctorPanel();
        docPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        uniqueID = String.valueOf(System.currentTimeMillis());
        gender = getSelectedButton(radioButtonGroup);
        dates = dateField.getText().replaceAll("\\s+", "");
        name = nameField.getText().replaceAll("\\s+", "_");
        age = ageField.getText();
        address = addressField.getText().replaceAll("\\s+", "_");
        con = conField.getText().replaceAll("\\s+", "_");
        dept = deptComBox.getSelectedItem().toString();
        marital = statComBox.getSelectedItem().toString();
        email = emailField.getText().replaceAll("\\s+", "");
        try {
            writeFile();
        } catch (IOException ex) {
            Logger.getLogger(addDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        doctorPanel docPanel = new doctorPanel();
        docPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField conField;
    private javax.swing.JTextField dateField;
    private javax.swing.JComboBox<String> deptComBox;
    private javax.swing.JLabel disLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField nameField;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JComboBox<String> statComBox;
    // End of variables declaration//GEN-END:variables
}

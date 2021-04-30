/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group10.hospitalmanagement.Admin;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class adminPanel implements ActionListener{
    private JFrame aFrame;

    private JButton aPatient;
    private JButton aDoctor;
    private JButton aNurse;
    private JButton aReceptionist;
    private JLabel adminPanelLabel;

    public adminPanel(){
        aFrame = new JFrame("Admin Panel");
        adminPanelLabel = new JLabel("ADMIN PANEL");
        aPatient = new JButton("Patients Information");
        aDoctor = new JButton("Doctors Information");
        aNurse = new JButton("Nurses Information");
        aReceptionist = new JButton("Receptionists Information");

        aFrame.setSize(1280, 720);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFrame.getContentPane().setBackground(Color.orange);
        aFrame.setVisible(true);

        //setting the dimensions of the contents
        adminPanelLabel.setBounds(520,0,1000,100);
        adminPanelLabel.setFont(new Font(null,Font.BOLD,38));
        adminPanelLabel.setForeground(Color.RED);

        aPatient.setBounds(340, 200 , 300, 100);
        aDoctor.setBounds(660, 200 , 300, 100);
        aNurse.setBounds(340, 350 , 300, 100);
        aReceptionist.setBounds(660, 350 , 300, 100);

        //adding the contents to the frame to be shown
        aFrame.setLayout(null);
        aFrame.add(aPatient);
        aFrame.add(aDoctor);
        aFrame.add(aNurse);
        aFrame.add(aReceptionist);
        aFrame.add(adminPanelLabel);

        //adding actionListeners to the buttons
        aPatient.addActionListener(this);
        aDoctor.addActionListener(this);
        aNurse.addActionListener(this);
        aReceptionist.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aPatient){
            aFrame.dispose();
            patientPanel pP = new patientPanel();
            pP.setVisible(true);
        } else if (e.getSource() == aDoctor){

        } else if (e.getSource() == aNurse){

        } else if (e.getSource() == aReceptionist){

        }
    }
}
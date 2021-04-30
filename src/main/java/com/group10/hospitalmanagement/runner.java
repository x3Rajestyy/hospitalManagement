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
public class runner {
    public static void main(String[] args) {
        UsernamePasswords up = new UsernamePasswords();
        loginPage lp = new loginPage(up.getLoginInfo());
    }
}

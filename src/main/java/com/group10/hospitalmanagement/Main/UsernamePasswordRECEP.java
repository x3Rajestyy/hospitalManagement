/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group10.hospitalmanagement.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/**
 *
 * @author Kurt Jayson Zacarias
 */
public class UsernamePasswordRECEP {
    final static String filePath = "usernamePassRecep.txt";
    HashMap<String, String> loginInfoRecep = new HashMap<>();
    
    UsernamePasswordRECEP(){
        BufferedReader br = null;

        try{

            //create file object
            File file = new File(filePath);

            //create BufferedReader object from the File
            br = new BufferedReader( new FileReader(file) );

            String line = null;

            //read file line by line
            while ( (line = br.readLine()) != null ){

                //split the line by :
                String[] parts = line.split(":");

                //first part is name, second is password
                String name = parts[0].trim();
                String password = ( parts[1].trim() );

                //put name, password in HashMap if they are not empty
                if( !name.equals("") && !password.equals("") )
                    loginInfoRecep.put(name, password);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            //Always close the BufferedReader
            if(br != null){
                try {
                    br.close();
                }catch(Exception e){};
            }
        }
    }

     public HashMap getLoginInfoRecep(){
        return loginInfoRecep;
    }
}

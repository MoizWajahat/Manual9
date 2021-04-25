/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pd3_26.taskFiles;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Task3 {

    static String RidMultipleBlank(String S) {
        String kid = "";

        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == ' ') {
                kid = kid + ' ';

                while (S.charAt(i) == ' ') {
                    i++;

                }
            }

            kid = kid + S.charAt(i);

        }

        return kid;
    }
    
    static String RemoveInteger (String S) {
        String NoLess = "";
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( !( (S.charAt(i) >= '0') && (S.charAt(i) <= '9') ) )
            {
                NoLess = NoLess + S.charAt(i);
            }
        }
        
        return NoLess;
    }
    
    static String StringEncryption (String S) {
        String Encrypt = "";
        int NLength = (int) (S.length() - (S.length() * 0.7));
        
        int min = 65;
        int max = 90;
        
        for (int i = 0; i < NLength; i++)
        {
            int RandomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
            Encrypt = Encrypt + (char) RandomInt;
        }
        
        return Encrypt;
    }

    public static void main(String[] args) {
        String S = JOptionPane.showInputDialog(null, "Please enter the String for processing:");

        JOptionPane.showMessageDialog(null, "Without extra spaces: " + RidMultipleBlank(S) + "\n"
                                          + "Without Integers: " + RemoveInteger(S) + "\n"
                                          + "Encrypted: " + StringEncryption(S));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pd3_26.task1;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Task2 {
    static String DisplayVertical (String S) {
        String V = "";
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( !(S.charAt(i) == ' ') )
            {
                V = V + S.charAt(i) + "\n";
            }
        }
        
        return V;
    }
    
    public static void main (String[] args) {
        String input;
        
        input = JOptionPane.showInputDialog("Please enter the String you want to be vertical: \n");
        
        JOptionPane.showMessageDialog(null, "Vertical String is: \n" + DisplayVertical(input));
    }
}

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
public class Task1 {
    static int WordCounter (String S) {
        int Num = 1;
        
        //Number of words in a sentence = Number of spaces + 1
        for (int i = 0; i < S.length(); i++)
        {
            if (S.charAt(i) == ' ')
            {
                Num++;
            }
        }
        
        return Num;
    }
    
    static int VowelCounter (String S) {
        int Num = 0;
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( (S.charAt(i) == 'A') || (S.charAt(i) == 'E') || (S.charAt(i) == 'I') || (S.charAt(i) == 'O') || (S.charAt(i) == 'U'))
            {
                Num++;
            }
            else if ( (S.charAt(i) == 'a') || (S.charAt(i) == 'e') || (S.charAt(i) == 'i') || (S.charAt(i) == 'o') || (S.charAt(i) == 'u'))
            {
                Num++;
            }
        }
        
        return Num;
    }
    
    static int PuncCount (String S) {
        int Num = 0;
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( (S.charAt(i) == '!') || (S.charAt(i) == '\"') || (S.charAt(i) == '\'') )
            {
                Num++;
            }
            else if ( (S.charAt(i) == '(') || (S.charAt(i) == ')') || (S.charAt(i) == ',') )
            {
                Num++;
            } 
            else if ( (S.charAt(i) == '-') || (S.charAt(i) == '.') || (S.charAt(i) == '/') )
            {
                Num++;
            }
            else if ( (S.charAt(i) == ':') || (S.charAt(i) == ';') || (S.charAt(i) == '?') )
            {
                Num++;
            }
            else if ( (S.charAt(i) == '[') || (S.charAt(i) == '\\') || (S.charAt(i) == ']') )
            {
                Num++;
            }
            else if ( (S.charAt(i) == '{') || (S.charAt(i) == '|') || (S.charAt(i) == '}') )
            {
                Num++;
            }
        }
        
        return Num;
    }
    
    static boolean FindSubString (String S, String sub) {
        int subCount = 0;
        int SCount = 0;
        boolean found = true;
        boolean attempt = false;
        
        while (SCount < S.length())
        {
            if ( S.charAt(SCount) == sub.charAt(subCount) )
            {
                for (int i = 0; i < sub.length(); i++)
                {
                    if (! (S.charAt(SCount) == sub.charAt(i)) )
                    {
                        found = false;
                        attempt = true;
                        break;
                    }
                    SCount++;
                }
            }
            else
            {
                SCount++;
            }
        }
        
        if (found && !attempt)
        {
            found = false;
        }
        
        return found;
    }
    
    public static void main (String[] args) {
        String input;
        String Sub;
        
        input = JOptionPane.showInputDialog("Please enter the string for analysis:\n");
        Sub = JOptionPane.showInputDialog("Also, please enter the sub-string.");
        
        JOptionPane.showMessageDialog(null, "Original String: " + input + "\n"
                                          + "Number of words: " + WordCounter(input) + "\n"
                                          + "Number of vowels: " + VowelCounter(input) + "\n"
                                          + "Number of punctuations: " + PuncCount(input) + "\n"
                                          + "\"" + Sub + "\"'s presence in this String: " + FindSubString(input, Sub) );
        
    }
}

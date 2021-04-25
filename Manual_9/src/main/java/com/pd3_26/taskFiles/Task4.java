/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pd3_26.taskFiles;

/**
 *
 * @author DELL
 */
public class Task4 {
    public static void main (String[] args) {
        
    }
}

class MyString {
    static String RetainIntegers (String S) {
        String IntOnly = "";
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( (S.charAt(i) >= '0') && (S.charAt(i) <= '9') )
            {
                IntOnly = IntOnly + S.charAt(i);
            }
        }
        
        return IntOnly;
    }
    
    static String RemovePuncs (String S) {
        String NoPunc = "";
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( !((S.charAt(i) == '!') || (S.charAt(i) == '\"') || (S.charAt(i) == '\'')) )
            {
                NoPunc = NoPunc + S.charAt(i);
            }
            else if ( !((S.charAt(i) == '(') || (S.charAt(i) == ')') || (S.charAt(i) == ',')) )
            {
                NoPunc = NoPunc + S.charAt(i);
            } 
            else if ( !((S.charAt(i) == '-') || (S.charAt(i) == '.') || (S.charAt(i) == '/')) )
            {
                NoPunc = NoPunc + S.charAt(i);
            }
            else if ( !((S.charAt(i) == ':') || (S.charAt(i) == ';') || (S.charAt(i) == '?')) )
            {
                NoPunc = NoPunc + S.charAt(i);
            }
            else if ( !((S.charAt(i) == '[') || (S.charAt(i) == '\\') || (S.charAt(i) == ']')) )
            {
                NoPunc = NoPunc + S.charAt(i);
            }
            else if ( !((S.charAt(i) == '{') || (S.charAt(i) == '|') || (S.charAt(i) == '}')) )
            {
                NoPunc = NoPunc + S.charAt(i);
            }
        }
        
        return NoPunc;
    }
    
    static String RetainLettersNumbers (String S) {
        String refine = "";
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( (S.charAt(i) >= 'A') && (S.charAt(i) <= 'Z') )
            {
                refine = refine + S.charAt(i);
            }
            else if ( (S.charAt(i) >= 'a') && (S.charAt(i) <= 'z') )
            {
                refine = refine + S.charAt(i);
            }
            else if ( (S.charAt(i) >= '0') && (S.charAt(i) <= '9') )
            {
                refine = refine + S.charAt(i);
            }
        }
        
        return refine;
    }
}
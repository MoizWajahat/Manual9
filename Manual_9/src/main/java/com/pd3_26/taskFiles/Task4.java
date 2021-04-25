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
    
    /**
     * This is a method that will save only the integers from a String.
     * @param S This will be an inputted String.
     * @return This will return only the integers from the String.
     */
    
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
    
    /**
     * This will remove all punctuation marks from a String.
     * @param S This will be an inputted String.
     * @return This will remove all punctuation marks from the String.
     */
    
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
    
    /**
     * This will remove all spaces from a String.
     * @param S This will be an inputted String.
     * @return This will remove all spaces from the String.
     */
    
    static String RemoveSpaces (String S) {
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
    
    /**
     * This will extend a given String to a given amount of length.
     * @param S This will be an inputted String.
     * @param size This will be the required size of the String (must be less than S.length().
     * @return This will return a String of the required size.
     */
    
    static String StringPadding (String S, int size) {
        String padded = "";
        int pads = size - S.length();
        
        for (int i = 0; i < pads; i++)
        {
            padded = padded + "-";
        }
        for (int i = 0; i < S.length(); i++)
        {
            padded = padded + S.charAt(i);
        }
        
        return padded;
    }
    
    /**
     * This method will return all the vowels from the String in order.
     * @param S An inputted String
     * @return A String of Vowels will be displayed (if S contains vowels) 
     */
    
    static String TakeVowels (String S) {
        String V = "";
        
        for (int i = 0; i < S.length(); i++)
        {
            if ( (S.charAt(i) == 'A') || (S.charAt(i) == 'E') || (S.charAt(i) == 'I') || (S.charAt(i) == 'O') || (S.charAt(i) == 'U'))
            {
                V = V + S.charAt(i);
            }
            else if ( (S.charAt(i) == 'a') || (S.charAt(i) == 'e') || (S.charAt(i) == 'i') || (S.charAt(i) == 'o') || (S.charAt(i) == 'u'))
            {
                V = V + S.charAt(i);
            }
        }
        
        return V;
    }
}
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
public class Task3 {

    static String RidMultipleBlank(String S) {
        int SpaceNum = 0;
        int Count;
        String kid = "";

        for (int i = 0; i < S.length(); i++) {

            kid = kid + S.charAt(i);

            if (S.charAt(i) == ' ') {
                
            }

        }

        return kid;
    }

    public static void main(String[] args) {
        String S = "a     b";

        System.out.print(RidMultipleBlank(S));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Array.Calculation;

/**
 *
 * @author Anonymous
 */
public class Calculator {
    public void calculator(double[] marks,double per){
        
    
            if (marks[0] >= 40 & marks[1] >= 40 & marks[2] >= 40 & marks[3] >= 40 & marks[4] >= 40) {

            if (per >= 80) {
                System.out.print(" Distinction");
            } else if (per > 60 && per <= 80) {
                System.out.print(" First  ");
            } else if (per > 45 && per <= 60) {
                System.out.print(" Second  ");
            } else if (per <= 40) {
                System.out.print(" Third  ");
            }
        } else {
            System.out.print(" Faild");
        }
    }
}

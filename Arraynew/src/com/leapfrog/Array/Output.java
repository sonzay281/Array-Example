/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Array;

import com.leapfrog.Array.Calculation.Calculator;

/**
 *
 * @author Anonymous
 */
public class Output {

    void display(double[] marks, double per, double total) {
        Calculator calc = new Calculator();
        System.out.println("");
        System.out.println("====================================================   ");
        System.out.println("Student Name \t Result \t Total \t Percantages");
        System.out.println("====================================================   ");
        System.out.print("Rohan Basnet");
        System.out.print("\t");
        calc.calculator(marks, per);

        System.out.print(" \t " + total);
        System.out.print(" \t " + per);
        System.out.println("");
        System.out.println("====================================================   ");
    }

}

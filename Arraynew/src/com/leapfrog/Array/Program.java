/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Array;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    static double total;
    static double per;

    /**
     *
     * @author Anonymous
     * @param args
     */
    public static void main(String[] args) {
        int i;

        String[] subjects = {"English", "Mathmatics", "Science", "Nepali", "Computer"};
        Scanner input = new Scanner(System.in);
        double[] marks = new double[subjects.length];
        System.out.println("Enter the marks secured in");
        for (i = 0; i < subjects.length; i++) {
            System.out.print(" " + subjects[i] + ":");
            marks[i] = input.nextDouble();
            total = total + marks[i];
            per = total / 5;
        }
        Output ou = new Output();
        ou.display(marks, per, total);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut01;

import javax.swing.JOptionPane;

/**
 *
 * @author chiyeung
 */
public class PrintPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String value = JOptionPane.showInputDialog("Enter something:");
        int inputValue = Integer.parseInt(value);
        if (inputValue < 16) {
            for (int i = inputValue; i >= 1; i--) {
                for (int k = 0; k < inputValue - i; k++) {
                    System.out.print("   ");
                }
                for (int j = i; j >= 1; j--) {
                    if (j > 9) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print(j + "  ");
                    }
                }
                for (int j = 2; j <= i; j++) {
                    if (j > 9) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print(j + "  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("The input is too big!!");
        }

    }
}

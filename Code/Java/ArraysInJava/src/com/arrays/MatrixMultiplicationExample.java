/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arrays;

/**
 *
 * @author Dell
 */
public class MatrixMultiplicationExample {

    public static void main(String args[]) {
//creating two matrices    
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
//3*3
        int b[][] = {{5, 5}, {6, 6}, {1, 1}};
//3*2
//x(0,0)*y(0,0)+(0,1)*(1,0)+(0,2)*(2,0)   (0,0)*(0,1)+(0,1)*(1,1)+(0,2)*(1,2)
//X(outer zero, 0,1,2 as k),Y(0,1,2as k, C:0)
//X outer zero, Y(0,1,2as k, C:1)

// c [3][2]
//creating another matrix to store the multiplication of two matrices    
        int c[][] = new int[3][2];  //3 rows and 2 columns  

//multiplying and printing multiplication of 2 matrices    
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {

                    c[i][j] += a[i][k] * b[k][j];
                }//end of k loop  
                System.out.print(c[i][j] + " ");  //printing matrix element  
            }//end of j loop  
            System.out.println();//new line    
        }
    }
}

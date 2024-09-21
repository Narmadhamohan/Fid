/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arrays;

/**
 *
 * @author Dell
 */
public class ThreeDimArray {
    public static void main(String[] args) {
        // Declare and initialize a 3x2x2 3D array
        int[][][] a = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} },
            { {9, 10}, {11, 12} }
        };

        // Loop through and print the array elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("a[" + i + "][" + j + "][" + k + "] = " + a[i][j][k]);
                }
            }
        }
    }
}


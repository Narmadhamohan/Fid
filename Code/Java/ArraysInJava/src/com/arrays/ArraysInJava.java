/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.arrays;

/**
 *
 * @author Narmadha Mohan
 * Pass-by-value with reference
 */
public class ArraysInJava {

    public static void modifyArray(int[] arr) {
        arr[0] = 20; // Modify the first element of the array
    }

    public static void main(String[] args) {
        int[] numbers = {10, 0, 0, 0}; // Create an array
        System.out.println("Before: " + numbers[0]); // Output: 10
        modifyArray(numbers); // Pass the array reference
        System.out.println("After: " + numbers[0]); // Output: 20
    }
}


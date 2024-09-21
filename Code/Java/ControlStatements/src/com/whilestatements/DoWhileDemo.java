/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.whilestatements;

import java.util.Scanner;

/**
 *
 * @author Narmadha Mohan
 * Play with relational operators and logical operators
 */
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
         int bill;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
              do {
            System.out.println("Enter bill amount to calculat eGST ");
         bill = myObj.nextInt();
        } while (bill < 11);
    }
}

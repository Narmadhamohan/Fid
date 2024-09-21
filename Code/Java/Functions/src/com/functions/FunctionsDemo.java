/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.functions;

/**
 *
 * @author Dell
 */
public class FunctionsDemo {

    /**
     * @param args the command line arguments
     */
    
 void addTwoNumbers(int packOfPencils, int packOfErasers,int[] arrOfPackets){
     arrOfPackets[0]=10;
packOfPencils =5;
        
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        int packOfPencils = 2;
        int packOfErasers = 3;
        int arrOfPackets[]={1,2};
        FunctionsDemo  demo = new FunctionsDemo();
        demo.addTwoNumbers(packOfPencils, packOfErasers,arrOfPackets );
        System.out.println("primitive: "+packOfPencils);
         System.out.println("derived: "+arrOfPackets[0]);
        
    }
    
}

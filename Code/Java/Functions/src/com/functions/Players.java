/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.functions;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Players {
    
        public static void main(String[] args) {
            
            String playerName = "";
            Players player = new Players();
         //   player.printPlayerName();
           // player.correctPlayerName("Dijo");
           // playerName = player.getNewPlayerName();
            
            playerName="helloworld";
           String trimName = playerName.substring(1,3);
            System.out.println("playerName: "+trimName);
            String[] split = "hi:hello:welcome".split(":");
            System.out.println(Arrays.toString(split));
            
       }

    private void printPlayerName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void correctPlayerName(String dijo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getNewPlayerName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
        
}

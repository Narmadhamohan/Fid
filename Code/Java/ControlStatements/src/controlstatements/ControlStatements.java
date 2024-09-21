/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlstatements;

/**
 *
 * @author Dell
 */
public class ControlStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // applyBrakes();
        // applyBrakesAndAlert();
         assignGradeATOF();
    }
    
    
  public static  void applyBrakes() {
    // the "if" clause: bicycle must be moving
    boolean isMoving = true;
    int currentSpeed = 50;
    if (isMoving){ 
        // the "then" clause: decrease current speed
        currentSpeed--;
        System.out.println("Yes I'm moving and my speed: "+currentSpeed);
    }
}
  
 public static  void applyBrakesAndAlert() {
      boolean isMoving = false;
    int currentSpeed = 50;
    if (isMoving) {
        currentSpeed--;
    } else {
        System.err.println("The bicycle has already stopped!");
    } 
 }
    public static void assignGradeATOF(){
      
      
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
  

  
}

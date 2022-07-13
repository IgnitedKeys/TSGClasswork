/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    
    public static void main(String[] args){
        Random diceRoller = new Random();
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("TIME TO ROOOOOLLLL THE DICE!!!");
        System.out.println("How many sides to the die?");
        int diceSides = Integer.parseInt(userInput.nextLine());
        int rollResult = diceRoller.nextInt(diceSides)+ 1;
        
        System.out.println("I rolled a " + rollResult);
        
        if(rollResult ==1){
            System.out.println("You rolled a critical failure!");
        }
        if(rollResult == diceSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}

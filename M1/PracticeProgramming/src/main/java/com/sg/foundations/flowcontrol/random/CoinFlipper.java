/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        
        Random coinToss = new Random();
        
        double randomNum = coinToss.nextDouble();
        boolean isHeads = randomNum < 0.5;
        
        System.out.println("Ready, Set, Flip.....!!!");
        
        if(isHeads == true){
            System.out.println("you got HEADS!");
        } else {
            System.out.println("you got TAILS");
        }
    }
    
}

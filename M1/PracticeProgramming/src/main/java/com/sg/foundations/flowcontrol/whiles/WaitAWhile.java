/*
 @author angeladrees
date: 2021-08-18
email: drees.angie@gmail.com
 */
package com.sg.foundations.flowcontrol.whiles;


public class WaitAWhile {
    public static void main(String[] args){
        int timeNow = 5;
        int bedTime = 10;
        
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up a liiiitttle longer....");
            timeNow++;
        }
        System.out.println("Oh. It's " + timeNow + " o'clock ");
        System.out.println("Guess I whould go to bed....");
    }
    //changing bedTime to 11 would give one more loop through the while loop before running the final println
    //If timeNow is 11 and bedTime is 10, it skips the while loop
    //if timeNow++ is gone, it would be an infinite while loop
    
}

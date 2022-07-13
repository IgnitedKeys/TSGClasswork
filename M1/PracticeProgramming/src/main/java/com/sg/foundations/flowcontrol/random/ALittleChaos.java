/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args){
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble() * (10 - 1) + 1);
        System.out.println("Or even a boolean: "+ randomizer.nextBoolean());
        
        int num = randomizer.nextInt(101);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        System.out.println("Or just keep generating new values: ");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
    }
    
    /* nothing- the 101 is 0-100, since random is exclusive to last number (the 101).
        (51) + 50 adds to the same, so the range is the same.
    */
    //you could assign the random number to a variable and use the variable in the math statement
    
}

/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {
        Scanner inputReader= new Scanner(System.in);
        System.out.println("Knock knock! Guess who! ");
        String nameGuess = inputReader.nextLine();
        
        if (nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("... from the Future.");
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
    /* if you use == instead of .equals it won't work. == is checking equality of the object
        , but strings are often stored in diffrent memory addresses so when comparing 
    two strings, they would be pointing at different addresses and not be equal(not the same object). 
    the equal method is comparing the content at both address and checking if the squence of chars is "equal"
    */
    
    /*
        capitalization matters! you could give two possible options,
        one capitalized, one lowercase went checking correctness in an OR (||)
        Otherwise, there might be a method that uppercased the user's input when
        assigning the variable.
    */
    
}

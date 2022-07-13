/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class DoOrDoNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Should I do it? (y/n) ");
        boolean doIt;
// notice the next() vs nextLine()!
        if (input.nextLine().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;
        do {
           iDidIt = true;
           break;
        } while (doIt);

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
    //it prints 'I did it' if y
    //it prints ' i know you said not to...etc' if n
    //if no do-while, the iDidIt stays false...so it prints the else statement for both answers
}

/*
@author angeladrees
 */
package com.sg.foundations.variables;

public class MoreBucketsMoreFun {
    public static void main(String [] args) {
        int butterflies, beetles, bugs;
        butterflies = 5;
        beetles = 9;
        bugs = butterflies + beetles;
       
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Un oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But wait, there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("...maybe my computer can't do math, after all!");
        
        
        // the unary operator -- is used to show the dog ate (-1) a butterfly.
        /*  although butterflies was changed by --, the value assigned to bugs
            on line 11 was not updated.
        */
        
    }
    
}

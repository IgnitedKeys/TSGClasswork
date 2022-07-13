/*
@author angeladrees
 */
package com.sg.foundations.scanner;

import java.util.Scanner;
public class AllTheTrivia {
    public static void main(String[] args) {
        String question1, question2, question3, question4;
        Scanner answer = new Scanner(System.in);
        
        System.out.println("How many Symphonies did Beethoven write? ");
        question1 = answer.nextLine();
        System.out.println("Chopin was known for composing for which instrument? ");
        question2 = answer.nextLine();
        System.out.println("The Baroque era \"ended\" which year? ");
        question3 = answer.nextLine();
        System.out.println("What style was Debussy known for composing? ");
        question4 = answer.nextLine();
        
        System.out.println("Beethoven wrote " + question3 + "symphonies! Wow!");
        System.out.println("I didn't know Chopin wrote for " + question4 + ".");
        System.out.println("And the Baroque era ended in " + question1 + ".");
        System.out.println("But of course Debussy was known for composing in the " + question2 + " style.");
        
                
    }
    
}

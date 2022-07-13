/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args){
        int counter = 0;
        Scanner inputReader = new Scanner(System.in);
        String answer1 = "1";
        String answer2 = "3";
        String answer3 = "2";
        
        String input1;
        String input2;
        String input3;
        
        System.out.println("It's time for TRIVIA NIGHT! ");
        System.out.println("FIRST QUESTION!");
        
        System.out.println("Which is the rain-bearing cloud?\n 1) Nimbus\t 2) Cumulus\n 3) Stratus \t 4) Cirrus");
        input1 = inputReader.nextLine();
        System.out.println("YOUR ANSWER: "+ input1);
        if(input1.equals(answer1)){
            counter += 1;
            System.out.println("That's correct! Current Score: " + counter + " Questions Remaining: 2");
        } else {
            System.out.println("Incorrect! Current Score: " + counter + " Questions Remaining: 2");
        }
        
        System.out.println("Which is a flat, layered, smooth cloud?\n 1)Nimbus\t 2) Cumulus\n 3) Stratus \t 4) Cirrus");
        input2 = inputReader.nextLine();
        System.out.println("YOUR ANSWER: " + input2);
        if(input2.equals(answer2)){
            counter += 1;
            System.out.println("That's correct! Current Score: " + counter + " Questions Remaining: 1");
        } else {
            System.out.println("Incorrect! Current Score: " + counter + " Questions Remaining: 1");
        }
       
        System.out.println("Which is a puffy cloud?\n 1) Nimbus\t 2) Cumulus\n 3) Stratus \t 4) Cirrus");
        input3 = inputReader.nextLine();
        System.out.println("YOUR ANSWER: " + input3);
        if(input3.equals(answer3)){
            counter += 1;
            System.out.println("That's correct! Current Score: " + counter + " Questions Remaining: 0");
        } else {
            System.out.println("Incorrect! Current Score: " + counter + " Questions Remaining: 0");
        }
        
        if(counter >= 2) {
            System.out.println("Nice job - you got " + counter + " correct!");
        } else if (counter == 1){
            System.out.println("You got " + counter + " correct.");
        } else {
            System.out.println("Oh no, you got " + counter + " correct :( ");
        }
            

    }
}
;

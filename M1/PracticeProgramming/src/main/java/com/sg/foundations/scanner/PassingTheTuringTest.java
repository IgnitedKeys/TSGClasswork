/*
 @author angeladrees
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        String yourName,aiName, color, food;
        int number;
        aiName = "Charlie";
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Howdy!\nWhat's your name? ");
        yourName = inputReader.nextLine();
        
        System.out.println("Nice to meet you " + yourName + "! Mine's " + aiName);
        System.out.println("What is your favorite color? ");
        color = inputReader.nextLine();
        System.out.println("Hmm, " + color + "...interesting choice.");
        System.out.println("Well I'm getting hungry...\nWhat is your favorite afternoon snack? ");
        food = inputReader.nextLine();
        System.out.println(food + "? Never tried that before. Maybe I'll give it a go.");
        System.out.println("Anyways, pick a number!");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println("Did you know " + (number * number) + " is " + number + " squared?");
        System.out.println("Well, I'm going to go try some " + food + ". Very nice to meet you " + yourName);
    }
    
}

/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox?");
        
        String action = userInput.nextLine();
        
        if(action.equals("open the mailbox")) {
            System.out.println("You opened the mailbox");
            System.out.println("It's really dark in there");
            System.out.println("Look inside or stick your hand in? ");
            
            action = userInput.nextLine();
            
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox");
                System.out.println("It's really very dark. So... so very dark");
                System.out.println("Run away or keep looking?");
                action = userInput.nextLine();
                
                if(action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in ")) {
                System.out.println("You stick your hand in the mailbox");
                System.out.println("You feel something soft...");
                System.out.println("Grab the soft item or leave quietly? ");
                action = userInput.nextLine();
                if(action.equals("grab soft item")) {
                    System.out.println("Its a small rodent");
                    System.out.println("He bites you and it get infected...oops");
                } else if (action.equals("leave quietly")){
                    System.out.println("You close the mailbox quietly");
                    System.out.println("And walk back the path you took...like a coward");
                }
            }
        } else if(action.equals("go to the house")) {
            System.out.println("You walk up to the porch.");
            System.out.println("Do you go through the front door, or explore the back?");
            action = userInput.nextLine();
            if(action.equals("go through the front door")){
                System.out.println("You peer inside and smell something delious");
                System.out.println("Do you go into the kitchen or sneak into the bedroom?");
                action = userInput.nextLine();
                if(action.equals("go into the kitchen")){
                    System.out.println("A woman is grabbing cookies out of the oven");
                    System.out.println("She smiles and offers you a cookie and a place for the night");
                    
                } else if(action.equals("sneak into the bedroom")){
                    System.out.println("Theres a warm bed and you decide to take a quick nap");
                    System.out.println("Later that night and homeowner see you in the bed and calls the cop.");
                    System.out.println("You get locked up in jail");
                }
            } else if (action.equals("explore the back")){
                System.out.println("There is a small garden and the door to the cellar in the backyard");
                System.out.println("You're tummy rumbles...you haven't eaten all day");
                System.out.println("Check the garden or go into the cellar?");
                action = userInput.nextLine();
                if(action.equals("check the garden")){
                    System.out.println("There are lots of veggies growing here!");
                    System.out.println("As you start eating them, the homeowner mistakes the rustling as a rabbit");
                    System.out.println("You get shot!");
                    
                } else if (action.equals("go into the cellar")){
                    System.out.println("There are lots of rations in here!");
                    System.out.println("You decide to eat a few and spend the night");
                    System.out.println("You safety leave in the morning and follow and path home");
                    
                }
                
            }
        }
    }
    
}

/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;
import java.util.Random;

public class BewareTheKraken {
    public static void main(String[] args) {

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goo000...! *SPLASH*");

        int depthDivedInFt = 0;
        int fish;
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();

        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            System.out.println("Should be continue? y/n");
            String answer = userInput.nextLine();
            if(answer.equals("n")){
                break;
            }
            fish = randomizer.nextInt(3);
            switch(fish){
                case 0:
                    System.out.println("Anchovy");
                    break;
                case 1:
                    System.out.println("Shark");
                    break;
                case 2:
                    System.out.println("Sea bass");
                    break;
            }
            
            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
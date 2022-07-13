/*
 @author angeladrees
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        int miles, hotdogs, languages;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How many miles can you run? ");
        miles = Integer.parseInt(inputReader.nextLine());
        System.out.println("Really? Well I can run " + (miles * 2 + 1) + " miles!");
        
        System.out.println("Ok, how many hot dogs can you eat? ");
        hotdogs = Integer.parseInt(inputReader.nextLine());
        System.out.println("Only " + hotdogs + "? I've eaten " + (hotdogs * 2 + 1) + " hotdogs before!");
        
        System.out.println("Well, how many languages can you speak? ");
        languages = Integer.parseInt(inputReader.nextLine());
        System.out.println("Peasant! I can speak " + (languages * 2 + 1) + " languages. Maybe even more!");
     
    }
    
}

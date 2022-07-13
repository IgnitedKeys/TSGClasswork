/*
@author angeladrees
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1, adjective1, noun2, number, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresent, verbPast;
        
        Scanner madReader = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!\n");
        System.out.println("Noun: ");
        noun1 = madReader.nextLine();
        
        System.out.println("Adjective: ");
        adjective1 = madReader.nextLine();
        
        System.out.println("Another Noun: ");
        noun2 = madReader.nextLine();
        
        System.out.println("A Number: ");
        number = madReader.nextLine();
        
        System.out.println("Another adjective: ");
        adjective2 = madReader.nextLine();
        
        System.out.println("Plural Noun: ");
        pluralNoun1 = madReader.nextLine();
        
        System.out.println("Another Plural Noun: ");
        pluralNoun2 = madReader.nextLine();
        
        System.out.println("One more Plural Noun: ");
        pluralNoun3 = madReader.nextLine();
        
        System.out.println("a verb(infinitive form): ");
        verbPresent = madReader.nextLine();
        
        System.out.println("same verb(past participle): ");
        verbPast = madReader.nextLine();
        
        System.out.println("\n*** NOW LETS GET MAD (libs) ***\n");
        System.out.println(noun1 + " : the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " + number + "-year mission:");
        System.out.println("to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " + adjective2 + " " + pluralNoun2 + " and ");
        System.out.println(adjective2 + " " + pluralNoun3 + ", to boldly " + verbPresent + " where no one has " + verbPast + " before." );
        
   
        
    }
    
}

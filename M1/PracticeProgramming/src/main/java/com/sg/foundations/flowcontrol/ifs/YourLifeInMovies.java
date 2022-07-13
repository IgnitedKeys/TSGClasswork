/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args){
        int year;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("What year were you born? ");
        year = Integer.parseInt(inputReader.nextLine());
        System.out.print("Did you know ");
        if(year < 2005) {
            System.out.println("that Pixar's 'Up' came out over a decade ago?");
        }
        if(year < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago.");
        }
        if (year < 1985) {
            System.out.println("Also, that Space Jam came out not last decade, but that one before THAT.");
        }
        if (year < 1975) {
            System.out.println("And that the original Jurassic Park release is closer to the first lunar landing than it is today.");
        }
        if (year < 1965) {
            System.out.println("Also, that the MASH TV series has been around for almost half a century!");
        }
        
    }
    
    
}

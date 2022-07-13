/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {
        String team1 = "Baggins";
        String team2 = "Dresden";
        String team3 = "Howl";
        String team4 = "Potter";
        String team5 = "Vimes";
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your last name? ");
        String lastName = userInput.nextLine();
        
        if (lastName.compareTo(team1) < 0) {
            System.out.println("You're on the team \"Red Dragons\"");
        }
        if (lastName.compareTo(team2) < 0 && lastName.compareTo(team1) >= 0) {
            System.out.println("You're on the team \"Dark Wizards\"");
        }
        if(lastName.compareTo(team3) < 0 && lastName.compareTo(team2) >= 0) {
            System.out.println("You're on the team \"Moving Castles\"");
        }
        if(lastName.compareTo(team4) < 0 && lastName.compareTo(team3) >= 0) {
            System.out.println("You're on the team \"Golden Snitches\"");
        }
        if(lastName.compareTo(team5) < 0 && lastName.compareTo(team4) >= 0) {
            System.out.println("You're on the team \"Night Guards\"");
        }
        if(lastName.compareTo(team5) >= 0) {
            System.out.println("You're on the team \"Black Holes\"");
        }
        System.out.println("Good luck in the games!");
        
        
    }
}

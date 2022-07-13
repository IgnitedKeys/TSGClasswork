/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args){
        int answer = 39;
        int guess;
        Scanner input = new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");
        guess = Integer.parseInt(input.nextLine());
        System.out.println("Your guess: " + guess);
        if (guess == answer) {
        System.out.println("Wow, nice guess! That was it");
        } if(guess < answer) {
            System.out.println("Ha, nice try - too low! I chose " + answer);
        } if (guess > answer) {
            System.out.println("Too bad, way too high. I chose " + answer);
        }
        
    }
}

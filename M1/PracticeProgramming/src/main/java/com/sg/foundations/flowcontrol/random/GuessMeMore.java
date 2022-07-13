/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {
    public static void main(String[] args){
        
        int guess;
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);
        
        int answer = randomNum.nextInt(100 - -100) + -100;
        System.out.println("I've chosen a number between 100 and 100. Betcha can't guess it!");
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

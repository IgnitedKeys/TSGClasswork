/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;
import java.util.Random;
public class GuessMeFinally {
        public static void main(String[] args){
        
        int guess;
        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);
        
        int answer = randomNum.nextInt(100 - -100) + -100;
        int counter = 0;
        boolean isCorrect = false;
         System.out.println("I've chosen a number between 100 and 100. Betcha can't guess it!");
        do{
            guess = Integer.parseInt(input.nextLine());
            System.out.println("Your guess: " + guess);
            counter++;
            
            if (guess == answer) {
                break;
            } if(guess < answer) {
                System.out.println("Ha, nice try - too low! Try again");
            } if (guess > answer) {
                System.out.println("Too bad, way too high. Try again");
        }
        }while(!isCorrect);
        if(counter == 1){
            System.out.println("Wow, nice guess! That was it");
        } else {
            System.out.println("Finally! It's about time you got it!");
        }
        
        
        
    }
    
    
}

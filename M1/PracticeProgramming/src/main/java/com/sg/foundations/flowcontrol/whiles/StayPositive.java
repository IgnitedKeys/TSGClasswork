/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick the starting number to count down from!");
        int startingNum = Integer.parseInt(userInput.nextLine());
        if(startingNum <= 0){
            System.out.println("Not a positive number!");
            //exit program if not valid
            System.exit(0);
        }
        int counter = 0;
        
    System.out.println("Counting down...");
    while(startingNum >= 0) {
        while(counter < 10){
             if(startingNum < 0){
                break;
            }
            System.out.print(startingNum + " ");
           
            if(counter == 10){
                startingNum--;
                break;
            } else{
            counter++;
            startingNum--;
            }

        }

        System.out.print("\n");
        counter = 0;

}
    
    }
    

}

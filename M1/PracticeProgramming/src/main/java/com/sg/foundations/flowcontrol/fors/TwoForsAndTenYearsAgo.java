/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class TwoForsAndTenYearsAgo {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What year would you like to count back from? ");
        int year = userInput.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }

        System.out.println("\nI can count backwards using a different way too...");

        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
        //the first loop's range is 0-10, the second is year to year-10
        //the first is easier to read, but the second  is clearer that we're counting backwards since it's using i--
        
        
    }
}

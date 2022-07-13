/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {

    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        int counter = 0;

        System.out.println("Which times table shall i recite? ");
        int number = Integer.parseInt(userNumber.nextLine());
        for (int i = 1; i < 16; i++) {
            System.out.println(i + " * " + number + " is: ");
            int answer = (i * number);
            int guess = Integer.parseInt(userNumber.nextLine());
            if (answer == guess) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("Sorry no, the anwer is: " + answer);
            }
        }
        System.out.println("You got " + counter + " correct!");
        if ((counter / 15) > 0.9) {
            System.out.println("Congrats on getting an A");
        } else if ((counter / 15) < 0.5) {
            System.out.println("You should study some more!");
        }
    }

}

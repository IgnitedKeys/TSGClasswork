/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        String keepRiding = "y";
        int loopsLooped = 0;
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEeeee.....!!!");
            System.out.println("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
            if(keepRiding.equals("n")){
                System.out.println("Okay, time to unbuckle you're seatbelt!");
                break;
            }
       
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
    
//if user enters anything thats not y, the loop will end.
    
    
}

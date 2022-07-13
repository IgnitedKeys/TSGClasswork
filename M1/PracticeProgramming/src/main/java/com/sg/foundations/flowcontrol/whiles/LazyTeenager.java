/*
@author angeladrees
date: 2021-08-18
email: drees.angie@gmail.com
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args) {
        int counter = 0;
        boolean isCleaned = false;
        Random checker = new Random();

        do {
            System.out.println("Clean your room!");
            counter++;
            int randomValue = checker.nextInt(10);
            if (randomValue < counter) {
                break;
            }
        } while (!isCleaned);
        if (counter < 7) {
            System.out.println("FINE! I'LL CLEAN MY ROOM.");
        } else {
            System.out.println("That's IT, I'm doing it. YOU'RE GROUNDED AND I'M TAKING YOUR XBOX");
        }

    }

}

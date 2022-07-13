/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class MaybeItLovesMe {

    public static void main(String[] args) {
        String message;

        Random pedalNumber = new Random();
        int pedals = pedalNumber.nextInt(89 - 13) + 13;
        if (pedals % 2 == 0) {
            message = "It does LOVES ME!!!!!!";
        } else {
            message = "Awwww bummer.";
        }
        int counter = 1;
        while (counter < pedals) {
            if (counter % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else {
                System.out.println("It LOVES me!");
            }
            counter++;
        }
        System.out.println(message);
        

    }

}

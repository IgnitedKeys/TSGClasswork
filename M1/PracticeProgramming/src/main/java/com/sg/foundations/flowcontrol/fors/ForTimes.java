/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args){
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Which times table shall i recite? ");
        int number = Integer.parseInt(userNumber.nextLine());
        for(int i = 1; i < 16; i++){
            System.out.println(i + " * " + number + " is: " + i*number );
        }
        
        
    }
}

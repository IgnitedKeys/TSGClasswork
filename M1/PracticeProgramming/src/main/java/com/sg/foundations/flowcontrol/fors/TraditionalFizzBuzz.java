/*
@author angeladrees
date: 2021-09-19
email:drees.angie@gmail.com
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;
public class TraditionalFizzBuzz {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many units of fizzing and buzzing do you need in life life?");
        int number = Integer.parseInt(userInput.nextLine());
        
        int counter = 0;
        for(int i = 0;counter < number ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
                counter++;
            } else if (i % 5 == 0){
                System.out.println("buzz");
                counter++;
            } else if (i % 3==0){
                System.out.println("fizz");
                counter++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");
        
    }
}

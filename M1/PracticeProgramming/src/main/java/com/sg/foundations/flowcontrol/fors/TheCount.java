/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;
public class TheCount {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("I LOVE TO COUNT!!! LET ME SHARE MY COUNTING WITH YOU");
        System.out.println("Start at: ");
        int startNum = Integer.parseInt(userInput.nextLine());
        System.out.println("Stop at: ");
        int stopNum = Integer.parseInt(userInput.nextLine());
        System.out.println("Count by: ");
        int countNum= Integer.parseInt(userInput.nextLine());
        
        int counter = 0;
        for( int i = startNum; i <= stopNum; i += countNum){
            if(counter < 3){
                System.out.print(i + " ");
                counter++;
            } else {
                System.out.println("Ah ah ah! \n");
                counter = 0;
            }
            
      
        }
    }
}

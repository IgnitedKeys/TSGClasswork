/*
@author angeladrees
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {
        int num1, num2, num3, result;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Lets add some numbers.\n Please give me the first number: ");
        num1 = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Please give me another number: ");
        num2 = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("And one more number please. ");
        num3 = Integer.parseInt(inputReader.nextLine());
        
        result = num1 + num2 + num3;
        
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
    }
    
}

/*
 @autor angeladrees
date: 2021-09-21
email: drees.angie@gmail.com
 */
package adrees.interestcalculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How much do you want to invest? ");
        float principle = Integer.parseInt(userInput.nextLine());
        
        
        System.out.println("How many years are you investing? ");
        int years = Integer.parseInt(userInput.nextLine());
        
        System.out.println("What is the annual interest rate % growth? ");
        float annualInterest = Integer.parseInt(userInput.next());
        
        System.out.println("Enter # for compound interest type: quarterly(4), monthly(12), or daily interest(365)?");
        int interestPeriod = Integer.parseInt(userInput.next());     
        
        //find interest
        float quarterInterest = (annualInterest/interestPeriod);
        System.out.println(quarterInterest);
        float interest = (1 + (quarterInterest/100));
        interest = exponent(interest,interestPeriod);
        
        
        for(int i = 1; i <= years; i++){
            float finalPrinciple = principle * interest;
            System.out.println("Year " + i + ":");
            System.out.printf("Began with $%.2f %n",principle);
            System.out.printf("Earned $%.2f %n",(finalPrinciple - principle));
            System.out.printf("Ended with $%.2f %n",finalPrinciple);
            principle = finalPrinciple;
        }
    }
    public static float exponent(float x, int y){
        float result = 1;
        for(int i = 1; i <= y; i++){
             result *= x;
        }
        return result;
    }
    
    
}

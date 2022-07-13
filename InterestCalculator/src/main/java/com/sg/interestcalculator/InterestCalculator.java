/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author angeladrees
 */
public class InterestCalculator {

    public void calculate() {
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
        float quarterInterest = (annualInterest / interestPeriod);
        System.out.println(quarterInterest);
        float interest = (1 + (quarterInterest / 100));
        Exponent finder = new Exponent();
        interest = finder.findExponents(interest, interestPeriod);

        for (int i = 1; i <= years; i++) {
            float finalPrinciple = principle * interest;
            System.out.println("Year " + i + ":");
            System.out.printf("Began with $%.2f %n", principle);
            System.out.printf("Earned $%.2f %n", (finalPrinciple - principle));
            System.out.printf("Ended with $%.2f %n", finalPrinciple);
            principle = finalPrinciple;
        }
    }

}

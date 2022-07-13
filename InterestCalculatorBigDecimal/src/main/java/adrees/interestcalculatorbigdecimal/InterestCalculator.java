/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.interestcalculatorbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author angeladrees
 */
public class InterestCalculator {

    public void calculate() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How much do you want to invest? ");
        BigDecimal principle = new BigDecimal(userInput.nextLine());

        System.out.println("How many years are you investing? ");
        BigDecimal years = new BigDecimal(userInput.nextLine());

        System.out.println("What is the annual interest rate % growth? ");
        BigDecimal annualInterest = new BigDecimal(userInput.nextLine());

        System.out.println("Enter # for compound interest type: quarterly(4), monthly(12), or daily interest(365)?");
        BigDecimal interestPeriod = new BigDecimal(userInput.nextLine());

        //find interest
        BigDecimal quarterInterest = annualInterest.divide(interestPeriod);

        System.out.println(quarterInterest);
        BigDecimal interest = ((quarterInterest.divide(new BigDecimal("100"))));
        interest = new BigDecimal("1").add(interest);
        System.out.println(interest);

        interest = interest.pow(interestPeriod.intValue());
        System.out.println(interest);

        for (int i = 1; i <= years.intValue(); i++) {

            BigDecimal finalPrinciple = principle.multiply(interest);
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + principle.setScale(2, RoundingMode.HALF_UP));
            System.out.println("Earned $" + (finalPrinciple.subtract(principle)).setScale(2, RoundingMode.HALF_UP));
            System.out.println("Ended with $" + finalPrinciple.setScale(2, RoundingMode.HALF_UP));
            principle = finalPrinciple;
        }
    }
}

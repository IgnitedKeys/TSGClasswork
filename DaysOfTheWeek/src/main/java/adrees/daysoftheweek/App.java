/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.daysoftheweek;

import java.util.Scanner;

/**
 *
 * @author angeladrees
 */
/*Exercise 1: How Many Days Until Friday
Create an enum for every day of the week,
Create an App class that asks the user to enter a day of the 
week and then use a switch statement and your enum to print 
out how many days there are until Friday.
 */
public class App {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        try {
            System.out.println("What day of the week is it?");
            String currentDay = userInput.nextLine().toUpperCase();
            daysOfTheWeek day = daysOfTheWeek.valueOf(currentDay);
            String daysToFri = daysUntilFriday(day);
            System.out.println("There are " + daysToFri + " days until Friday!");
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

    }

    public static String daysUntilFriday(daysOfTheWeek day) {

        switch (day) {
            case FRIDAY:
                return "0";
            case SATURDAY:
                return "6";
            case SUNDAY:
                return "5";
            case MONDAY:
                return "4";
            case TUESDAY:
                return "3";
            case WEDNESDAY:
                return "2";
            case THURSDAY:
                return "1";
            default:
                throw new UnsupportedOperationException();

        }

    }

}

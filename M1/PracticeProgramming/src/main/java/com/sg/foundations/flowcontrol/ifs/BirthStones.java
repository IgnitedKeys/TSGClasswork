/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {
        int monthNumber;
        String birthStone;
        String month;
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What month's birthstone do you wish to know? ");
        monthNumber = Integer.parseInt(inputReader.nextLine());
        switch (monthNumber) {
            case 1:
                birthStone = "Garnet";
                month ="January";
                break;
            case 2:
                birthStone = "Amethyst";
                month ="February";
                break;
            case 3:
                birthStone = "Aquamarine";
                month ="March";
                break;
            case 4:
                birthStone = "Diamond";
                month ="April";
                break;
            case 5:
                birthStone = "Emerald";
                month ="May";
                break;
            case 6:
                birthStone = "Pearl";
                month ="June";
                break;
            case 7:
                birthStone = "Ruby";
                month ="July";
                break;
            case 8:
                birthStone = "Peridot";
                month ="August";
                break;
            case 9:
                birthStone = "Sapphire";
                month ="September";
                break;
            case 10:
                birthStone = "Opal";
                month ="October";
                break;
            case 11:
                birthStone = "Topaz";
                month ="November";
                break;
            case 12:
                birthStone = "Turquoise";
                month ="December";
                break;
            default: 
                month = "error";
                birthStone = "Invalid";
                break;
        }
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("I think you must be confused, " + monthNumber + " doesn't match a month.");
        } else {
            System.out.println(month + "'s birthstone is " + birthStone +".");
        }
        
        
        
        
    }
    
}

/*
@author angeladrees
date: 2021-09-18
 */
package com.sg.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {
    public static void main(String[] args){
        int birdsInPie = 1;
        for (int i =1; i < 24; i++){
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are "+ birdsInPie +" birds in there!");
        System.out.println("Quite the pie full!");
    }
    /*change the starting value of the loop counter to 1, so the print out starts with #1
        Then, change the birdsInPie to 1, since the loop is only going 23 times now.
    */
}

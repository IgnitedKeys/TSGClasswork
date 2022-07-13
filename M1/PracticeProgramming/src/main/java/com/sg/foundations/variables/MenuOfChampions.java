/* * To change this license header, choose License Headers in Project Properties.
 @author angeladrees
 */
package com.sg.foundations.variables;

public class MenuOfChampions {

    public static void main(String[] args) {
        double priceOfBurger,priceOfFlapJacks,priceOfReuben;
        String Burger,FlapJacks,Reuben;
        priceOfBurger = 10.50;
        priceOfFlapJacks = 9.25;
        priceOfReuben = 9.00;
        Burger = "Cheeseburger";
        FlapJacks = "Tripe-stack Pancakes";
        Reuben = "Traditional Reuben";

        System.out.println("*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*\n");
        System.out.println("\tMARY'S DINER\n");
        System.out.println("*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*:*.*\n");
        System.out.println("\t$ " + String.format("%.2f", priceOfBurger)+ "\t" + Burger);
        System.out.println("\t$ " + String.format("%.2f", priceOfFlapJacks) + "\t" + FlapJacks);
        System.out.println("\t$ " + String.format("%.2f", priceOfReuben) + "\t" + Reuben);
        

    }

}

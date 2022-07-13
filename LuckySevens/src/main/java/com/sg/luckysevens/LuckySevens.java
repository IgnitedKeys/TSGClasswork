/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

import java.util.Scanner;

/**
 *
 * @author angeladrees
 */
public class LuckySevens {

    public void playGame() {
        Scanner userInput = new Scanner(System.in);
        int counter = 0;
        int maxMoney = 0;
        int counterAtMax = 0;

        System.out.println("How many dollars do you have?");
        int bet = Integer.parseInt(userInput.nextLine());

        RollDice myDie = new RollDice();
        while (bet > 0) {
            int dice1 = myDie.roll();
            int dice2 = myDie.roll();

            if (dice1 + dice2 == 7) {
                bet += 4;
            } else {
                bet -= 1;
            }
            counter++;
            if (bet > maxMoney) {
                maxMoney = bet;
                counterAtMax = counter;
            }

        }
        System.out.println("You are broke after " + counter + " rolls.");
        System.out.println("Should should have quit after " + counterAtMax + " rolls when you had " + maxMoney);

    }

}

/*
 @angeladrees
date: 2021-09-21
email: drees.angie@gmail.com
 */
package adrees.luckysevens;

import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        int counter = 0;
        int maxMoney = 0;
        int counterAtMax = 0;
        
        System.out.println("How many dollars do you have?");
        int bet = Integer.parseInt(userInput.nextLine());
        
        while(bet > 0){
            int dice1 = rollDice();
            int dice2 = rollDice();
            
            if(dice1 + dice2 == 7){
                bet += 4;
            } else {
                bet -= 1;
            }
            counter ++;
            if(bet > maxMoney){
                maxMoney = bet;
                counterAtMax = counter;
            }
            
        }
        System.out.println("You are broke after " + counter + " rolls.");
        System.out.println("Should should have quit after " + counterAtMax + " rolls when you had " + maxMoney);
        
    }
    public static int rollDice(){
        Random diceRoll = new Random();
        int roll = diceRoll.nextInt(6) +1;
       return roll; 
    }
    
}

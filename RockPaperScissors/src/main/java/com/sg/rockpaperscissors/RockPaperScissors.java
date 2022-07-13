/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissors;

/**
 *
 * @author gavinlinnihan
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public void playGame() {
        Scanner userInput = new Scanner(System.in);
        Random computerInput = new Random();

        int rounds, userMove, compMove;
        boolean playGame = true;
        String message = "";

        while (playGame == true) {
            System.out.println("How many rounds?");
            rounds = Integer.parseInt(userInput.nextLine());
            if (rounds > 10 || rounds < 1) {
                playGame = false;
                message = "Not within bounds";
                continue;
            }
            int roundsPlayed = 0;
            int loses = 0;
            int wins = 0;
            int ties = 0;

            while (roundsPlayed < rounds) {
                System.out.println("Rock (1) Paper(2) Scissors(3)? input number(#)");
                userMove = Integer.parseInt(userInput.nextLine());
                compMove = computerInput.nextInt(3) + 1;

                String[] rps = {"", "Rock", "Paper", "Scissors"};

                if (userMove == compMove) //Tie
                {
                    System.out.println("You both chose " + rps[userMove] + "! Its a tie!");
                    ties++;
                } else if ((userMove == 1 && compMove == 3)
                        || (userMove == 2 && compMove == 1)
                        || (userMove == 3 && compMove == 2)) //Win
                {
                    System.out.println("You chose " + rps[userMove] + " and the computer chose " + rps[compMove] + "! You win!");
                    wins++;
                } else {
                    System.out.println("You chose " + rps[userMove] + " and the computer chose " + rps[compMove] + "! You lose!");
                    loses++;
                }

                roundsPlayed++;
            }
            //declare winner and overall results
            System.out.println("Ties: " + ties + "\tWins: " + wins + "\tLoses: " + loses);
            if (wins > loses) {
                System.out.println("YOU WIN!");
            } else if (loses > wins) {
                System.out.println("COMPUTER WINS");
            } else {
                System.out.println("tie");
            }

            System.out.println("Play more rounds? y/n");
            String moreRounds = userInput.nextLine();
            if (moreRounds.equals("n")) {
                playGame = false;
                message = "Thanks for playing";
            }

        }
        System.out.println(message);
    }
}

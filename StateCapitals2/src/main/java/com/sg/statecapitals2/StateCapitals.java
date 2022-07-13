/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals2;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import com.sg.userioclasslab.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angeladrees
 */
public class StateCapitals {

    public static void main(String[] args) throws Exception {
        Map<String, String> capitals = new HashMap<>();
        UserIO userIo = new UserIOImpl();

        String file = "StateCapitals.txt";

        Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] parts = currentLine.split("::", 2);
            String key = parts[0];
            String value = parts[1];
            capitals.put(key, value);
        }

        System.out.println(capitals.size() + " STATES & CAPITALS ARE LOADED\n=======");

        System.out.println("HERE ARE THE STATES:\n=======");
        Set<String> keys = capitals.keySet();
        for (String k : keys) {
            System.out.print(k + ", ");
        }
        System.out.println("\n");
        //Set<String> states = capitals.keySet();

        Random random = new Random();
        int score = 0;

        List<String> states = new ArrayList<String>(capitals.keySet());
        List<String> arrayOfStates = new ArrayList<>();
        int numberOfQuestions = userIo.readInt("How many questions would you like to answer?");
        System.out.print("READY TO TEST YOUR KNOWLEDGE? ");
        int questionsAsked = 0;
        while (questionsAsked < numberOfQuestions) {
            String question = states.get(random.nextInt(keys.size()));
            if (arrayOfStates.contains(question)) {
                continue;
            } else {
                arrayOfStates.add(question);
                String answer = userIo.readString("WHAT IS THE CAPITAL OF '" + question + "'?");
                if (answer.equals(capitals.get(question))) {
                    System.out.println("NICE WORK! " + answer + " is correct!");
                    score += 1;
                } else {
                    System.out.println("Incorrect!");
                    score -= 1;

                }
                questionsAsked++;
            }
        }
        System.out.println("Your score is " + score);

    }
}

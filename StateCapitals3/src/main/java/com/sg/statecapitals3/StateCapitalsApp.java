/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals3;

import java.util.HashMap;
import java.util.Map;
import com.sg.userioclasslab.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author angeladrees
 */
public class StateCapitalsApp {

    public static void main(String[] args) throws Exception {

        Map<String, Capital> capitalHash = new HashMap<>();
        UserIO userIo = new UserIOImpl();

        String file = "MoreStateCapitals.txt";

        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            String[] parts = currentLine.split("::", 4);
            String stateName = parts[0];
            String capitalName = parts[1];
            int population = Integer.parseInt(parts[2]);
            double sqMi = Double.parseDouble(parts[3]);
            Capital capital = new Capital(capitalName, population, sqMi);

            capitalHash.put(stateName, capital);
        }
        System.out.println(capitalHash.size() + " STATES/CAPITAL PAIRS ARE LOADED\n=====================");

        List<String> stateList = new ArrayList<String>(capitalHash.keySet());
        for (String s : stateList) {
            Capital value = capitalHash.get(s);
            System.out.println(s + " | " + value.getName() + " | " + value.getPopulation() + " | " + value.getSqMi());
        }

        int minPopulation = userIo.readInt("Please enter the lower limit for capital city population:");
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + minPopulation);

        for (String s : stateList) {
            Capital value = capitalHash.get(s);
            if (value.getPopulation() > minPopulation) {
                System.out.println(s + " | " + value.getName() + " | " + value.getPopulation() + " | " + value.getSqMi());
            }
        }

        double maxSqMi = userIo.readDouble("Please enter the upper limit for capital city sq mileage:");
        System.out.println("LISTING CAPITALS WITH AREAS LESS THAN " + maxSqMi);
        
        for(String s : stateList){
            Capital value = capitalHash.get(s);
            if ( value.getSqMi() < maxSqMi) {
                System.out.println(s + " | " + value.getName() + " | " + value.getPopulation() + " | " + value.getSqMi());
            }
        }

    }

}

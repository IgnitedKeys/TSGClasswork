/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author angeladrees
 */
public class App {

    public static void main(String[] args) {
        //declare hashmap
        Map<String, String> capitals = new HashMap<>();

        //load states and capitals
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alabama", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas","Little Rock");
        capitals.put("California","Sacramento");
        capitals.put("Delaware","Dover");
        capitals.put("Florida","Tallahessee");
        capitals.put("Georgia","Atlanta");
        capitals.put("Hawaii", "Honolulu");
        capitals.put("Idaho","Boise");
        capitals.put("Ilinois","Springfield");
        capitals.put("Iowa","DesMoines");
        capitals.put("Kansas","Topeka");
        capitals.put("Kentucky","Frankfort");
        capitals.put("Louisiana","Baton Rouge");
        capitals.put("Maine","Augusta");
        capitals.put("Maryland","Annapolis");
        capitals.put("Massachusetts","Boston");
        capitals.put("Michigan","Lansing");
        capitals.put("Minnesota","Saint Paul");

        //print states
        System.out.println("STATES:\n=======");
        Set<String> keys = capitals.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

        //print capitals
        System.out.println("CAPITALS:\n=========");
        Collection<String> cValues = capitals.values();
        for(String c : cValues){
            System.out.println(c);
        }
        //print states with capitals
        System.out.println("STATE/CAPITAL PAIRS:\n=====================");
        for (String k : keys) {
            System.out.println(k + " " + capitals.get(k));
        }

    }

}

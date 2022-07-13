/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseB.placeOf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class LogicExerciseBTest {
    /*
     * Given a number, return the 'place rank' word associated with it.
     * I.e. pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! 
     * Also, start by going up to 100, but stretch to more if you can!
     *
     * Ex:
     * placeOf( 1 ) ->   "1st"
     * placeOf( 3 ) ->   "3rd"
     * placeOf( 22 ) ->   "22nd"
     *
     * @param place
     * @return String
     */
    
    public LogicExerciseBTest() {
    }

    @Test
    public void placeOf1() {
        int place = 1;
        String result = placeOf(place);
        
        assertEquals("1st", result);
    }
    
    @Test
    public void placeOf3() {
        int place = 3;
        String result = placeOf(place);
        
        assertEquals("3rd", result);
    }
    
    @Test
    public void placeOf22() {
        int place = 22;
        String result = placeOf(place);
        
        assertEquals("22nd", result);
    }
    
}

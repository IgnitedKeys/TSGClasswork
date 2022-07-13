/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseE.containsTheOther;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class StringsExerciseETest {
    /*
     * Take in two Strings - return true if either String 'contains' the other... 
     * but false if they are exactly equal, or completely different.
     *
     * Ex:
     * containsTheOther( "one", "tone" ) ->  true
     * containsTheOther( "same", "same" ) ->  false
     * containsTheOther( "fancypants", "pants" ) ->  true
     * containsTheOther( "llama", "duck" ) ->  false
     * 
     * @param one
     * @param two
     * @return boolean
     */
    
    public StringsExerciseETest() {
    }

    @Test
    public void containsTheOther1() {
        String one = "one";
        String two = "tone";
        boolean contains = containsTheOther(one, two);
        assertEquals(true, contains);
    }
    @Test 
    public void containsTheOther2() {
        String one = "same";
        String two = "same";
        boolean contains = containsTheOther(one, two);
        assertEquals(false, contains);
        
    }
    @Test 
    public void containsTheOther3() {
        String one = "fancypants";
        String two = "pants";
        boolean contains = containsTheOther(one, two);
        assertEquals(true, contains);
        
    }
    @Test
    public void containsTheOther4() {
        String one = "llama";
        String two = "duck";
        boolean contains = containsTheOther(one, two);
        assertEquals(false, contains);
        
    }
    
}

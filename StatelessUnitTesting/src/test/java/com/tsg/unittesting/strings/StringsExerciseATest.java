/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseA.yell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class StringsExerciseATest {
    /*
     * Take a word, and change it so that it is a shout. 
     * If there are any quiet letters, make them LOUD!
     *
     * Ex:
     * yell( "Hello there." ) ->  "HELLO THERE."
     * yell( "shhhhhhhhhhhh" ) ->  SHHHHHHHHHHHH
     * yell( "AAaAAAaAAAaaAAHHHH" ) ->  "AAAAAAAAAAAAAAHHHH"
     * 
     * @param word
     * @return String yell
     */
    
    public StringsExerciseATest() {
    }

    @Test
    public void yellHelloThere() {
        String word = "Hello there.";
        String yell = yell(word);
        assertEquals("HELLO THERE.", yell);
    }
    
    @Test
    public void yellShh(){
        String word = "shhhhhhhhhhhh";
        String yell = yell(word);
        assertEquals("SHHHHHHHHHHHH", yell);
        
    }
    @Test
    public void yellAhh(){
        String word = "AAaAAAaAAAaaAAHHHH";
        String yell = yell(word);
        assertEquals("AAAAAAAAAAAAAAHHHH", yell);
    }
    
}

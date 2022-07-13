/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseD.simpleReverse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class StringsExerciseDTest {
    /*
     * Given a phrase string - turns the whole thing around.
     * Return the original, but totally backwards to forwards!
     *
     * 
     * Ex:
     * simpleReverse( "fun times" ) ->  "semit nuf"
     * simpleReverse( "llama llama duck" ) ->  "kcud amall amall"
     * simpleReverse( "hannah" ) ->  "hannah"
     * 
     * @param phrase
     * @return String backwards
     */
    
    public StringsExerciseDTest() {
    }

    @Test
    public void simpleReverseFun() {
        String phrase = "fun times";
        String backwards = simpleReverse(phrase);
        assertEquals("semit nuf", backwards);
    }
    
    @Test
    public void simpleReverseLlama(){
        String phrase = "llama llama duck";
        String backwards = simpleReverse(phrase);
        assertEquals("kcud amall amall", backwards);
        
    }
    @Test
    public void simpleReverseHannah(){
        String phrase = "hannah";
        String backwards = simpleReverse(phrase);
        assertEquals("hannah", backwards);
    }
    
}

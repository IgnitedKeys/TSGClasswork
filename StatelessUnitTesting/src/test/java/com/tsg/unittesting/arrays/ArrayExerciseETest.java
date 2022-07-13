/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseE.camelCaseIt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class ArrayExerciseETest {
    /*
     * Given an array of words turn it into a single camelCased phrase.
     * Lower case the first word, capitalize the first letter (but only the first) of the rest.
     *
     * camelCaseIt( {"llama", "llama", "duck"}  ) ->  "llamaLlamaDuck"
     * camelCaseIt( {"lambs", "eat", "oats", "and", "does", "eat", "oats"}  ) ->  "lambsEatOatsAndDoesEatOats"
     * camelCaseIt( {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"}  ) ->  "doOrDoNotThereIsNoTry"
     * @param words
     * @return String camelCased phrase
     */
    
    public ArrayExerciseETest() {
    }

    @Test
    public void camelCaseItLlama() {
        String[] words = new String[] {"llama", "llama","duck"};
        String result = camelCaseIt(words);
        assertEquals(result, "llamaLlamaDuck");
    }
    
    @Test
    public void camelCaseItOats() {
        String[] words = new String[] {"lambs", "eat", "oats", "and", "does", "eat", "oats"};
        String result = camelCaseIt(words);
        assertEquals(result, "lambsEatOatsAndDoesEatOats");
    }
    
    @Test
    public void camelCaseItYoda(){
        String[] words = new String[] {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"};
        String result = camelCaseIt(words);
        assertEquals(result, "doOrDoNotThereIsNoTry");
    }
}

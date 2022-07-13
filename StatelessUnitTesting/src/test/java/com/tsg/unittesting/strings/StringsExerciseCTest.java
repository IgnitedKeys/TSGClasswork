/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseC.removeTheVowels;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class StringsExerciseCTest {
     /**
     * Take a word, and remove all its vowels and returns it.
     *
     * Ex:
     * removeTheVowels( "truncate" ) ->  "trnct"
     * removeTheVowels( "squashed" ) ->  "sqshd"
     * removeTheVowels( "compressed" ) ->  "cmprssd"
     * @param word
     * @return String
     */
    
    public StringsExerciseCTest() {
    }

    @Test
    public void removeTheVowelTruncate() {
        String word = "truncate";
        String result = removeTheVowels(word);
        assertEquals("trnct", result);
    }
    
    @Test
    public void removeTheVowelsSquashed(){
        String word = "squashed";
        String result = removeTheVowels(word);
        assertEquals("sqshd", result);
    }
    
    @Test
    public void removeTheVowelsCompressed() {
        String word = "compressed";
        String result = removeTheVowels(word);
        assertEquals("cmprssd", result);
    }
}

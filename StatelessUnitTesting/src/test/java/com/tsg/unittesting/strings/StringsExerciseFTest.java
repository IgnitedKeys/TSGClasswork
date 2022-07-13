/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseF.longestWord;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class StringsExerciseFTest {
    /*
     * Take in a phrase that has many words separated by spaces. 
     * Return the longest word that you can find within the phrase - 
     * don't forget, hyphenated words are allowed!
     *
     * If there is a tie, return the first instance of a word of that size.
     *
     * Ex:
     * longestWord( "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation anevaporationd 2% butterscotch ripple" ) ->  "perspiration"
     * longestWord( "All well-established principles should be periodically challenged" ) ->  "well-established"
     * longestWord( "Never argue with the data" ) ->  "Never"
     * 
     * @param aPhrase
     * @return String word
     */
    
    public StringsExerciseFTest() {
    }

    @Test
    public void longestWord1() {
        String phrase = "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation an evaporationd 2% butterscotch ripple";
        String word = longestWord(phrase);
        assertEquals("perspiration", word);
        
    }
    @Test
    public void longestWord2() {
        String phrase = "All well-established principles should be periodically challenged";
        String word = longestWord(phrase);
        assertEquals("well-established",word);
                
    }
    @Test
    public void longestWord3() {
        String phrase = "Never argue with the data";
        String word = longestWord(phrase);
        assertEquals("Never", word);
    }
    
    
    
}

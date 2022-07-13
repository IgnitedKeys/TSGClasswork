/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseD.isFirstTheFirst;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class LogicExerciseDTest {
    /*
     * Given two characters, return true if the first letter parameter comes 
     * earlier in the alphabet than the second letter parameter. 
     * Don't worry about casing, just turn consider everything in lowercase.
     *
     * Ex:
     * isFirstTheFirst( 'a' , 'b'  ) ->  true
     * isFirstTheFirst( 'O' , 'X'  ) ->  true
     * isFirstTheFirst( 'Z' , 'z'   ) -> false
     * 
     * @param letterOne
     * @param letterTwo
     * @return boolean
     */
    
    public LogicExerciseDTest() {
    }

    @Test
    public void isFirstTheFirstA() {
        char letterOne = 'a';
        char letterTwo = 'b';
        
        boolean isFirst = isFirstTheFirst(letterOne, letterTwo);
        assertEquals(isFirst, true);
    }
    
    @Test
    public void isFirstTheFirstO() {
        char letterOne = 'O';
        char letterTwo = 'X';
        
        boolean isFirst = isFirstTheFirst(letterOne, letterTwo);
        assertEquals(isFirst, true);
        
    }
    
    @Test
    public void isFirstTheFirstZ() {
        char letterOne = 'Z';
        char letterTwo = 'z';
        
        boolean isFirst = isFirstTheFirst(letterOne, letterTwo);
        assertEquals(isFirst, false);
        
    }
    
}

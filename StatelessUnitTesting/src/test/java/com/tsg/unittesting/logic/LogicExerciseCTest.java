/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseC.goWalky;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class LogicExerciseCTest {
    
    /*
     * Figure out if you're taking your dog for a walk.
     * Your dog wants to go for a walk - however, there are multiple factors 
     * that you must consider before going. 
     * 
     * You only go walking if it's light outside, or if you have a flashlight. 
     * Also only if it's not raining, or if you have an umbrella. 
     * And if it's not too hot (more than 95 degrees) and not too cold (less than 50 degrees).
     *
     * Ex:
     * goWalky( true, false, true, true, 75  ) ->  true
     * goWalky( false, true, false, false, 50  ) ->  true
     * goWalky( false, false, false, false, 30  ) ->  false
     * 
     * @param isDark
     * @param haveFlashlight
     * @param isRaining
     * @param haveUmbrella
     * @param degreesFarenheit
     * @return boolean
     */
    public LogicExerciseCTest() {
    }

    @Test
    public void goWalky75() {
        
        boolean isDark = true;
        boolean haveFlashlight = false;
        boolean isRaining = true;
        boolean haveUmbrella = true;
        int degreesFarenheit = 75;
        
        boolean result = goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(result, false);
    }
    
    @Test
    public void goWalky50() {
        boolean isDark = false;
        boolean haveFlashlight = true;
        boolean isRaining = false;
        boolean haveUmbrella = false;
        int degreesFarenheit = 50;
        
        boolean result = goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(result, true);
    }
    
    @Test 
    public void goWalky30 () {
        boolean isDark = false;
        boolean haveFlashlight = false;
        boolean isRaining = false;
        boolean haveUmbrella = false;
        int degreesFarenheit = 30;
        
        boolean result = goWalky(isDark, haveFlashlight, isRaining, haveUmbrella, degreesFarenheit);
        assertEquals(result, false);
    }
    
}

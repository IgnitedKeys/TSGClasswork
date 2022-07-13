/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseC.stringThemTogether;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class ArrayExerciseCTest {
    /**
     * Given an array of integers, return them all as a single continuous text value.
     * 
     * stringThemTogether( { 1, 3, 3, 7 }  ) ->  "1337"
     * stringThemTogether( { 1, 33, 555, 7777, 99999 } ) ->  "133555777799999"
     * stringThemTogether( { }  ) ->  ""
     * 
     * @param nums
     * @return String
     */
    
    public ArrayExerciseCTest() {
    }

    @Test
    public void stringThemTogether1() {
        int[] nums = new int[] {1,3,3,7};
        String result = stringThemTogether(nums);
        
        assertEquals(result, "1337");
    }
    
    @Test
    public void stringThemTogether2() {
        int[] nums = new int[] {1,33,555,7777,99999};
        String result = stringThemTogether(nums);
        
        assertEquals(result, "133555777799999");
    }
    @Test
    public void stringThemTogther3() {
        int[] nums = new int[] {};
        String result = stringThemTogether(nums);
        assertEquals(result,"");
    }
}

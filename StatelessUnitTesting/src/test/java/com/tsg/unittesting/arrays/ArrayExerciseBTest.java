/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class ArrayExerciseBTest {
    /*
     * Given a integer and an array of ints, times each number in the array by the multiplier.
     *
     * Example Results:
     * multiplyAll( 5 , [ 1 , 2 , 3 , 4 , 5 ] ) ->  [ 5 , 10 , 15 , 20 , 25 ]
     * multiplyAll( 0 , [ 1 , 1 , 1 , 1 , 1  , 1 , 1 , 1 , 1 ] ) ->  [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ]
     * multiplyAll( -1 , [ -2 , 0 , 0 , 1 ] ) ->  [ 2 , 0 , 0 , -1 ]
     * 
     * @param multiplier
     * @param numbers
     * @return int[] numbers multiplied
     */

    
    public ArrayExerciseBTest() {
    }

    @Test
    public void multiplyAll5() {
        int multiplier = 5;
        int[] numbers = new int[] {1,2,3,4,5};
        int[] results = multiplyAll(multiplier, numbers);
        
        
        assertArrayEquals(results, new int[] {5,10,15,20,25});
    }
    
    @Test
    public void multiplyAll0() {
        int multiplier = 0;
        int[] numbers = new int[] {1 , 1 , 1 , 1 , 1  , 1 , 1 , 1 , 1};
        int[] results = multiplyAll(multiplier, numbers);
        
        assertArrayEquals(results, new int[]{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0});
    }
    
    @Test
    public void multiplyAllNeg1() {
    int multiplier = -1;
    int[] numbers = new int[]{ -2 , 0 , 0 , 1};
    int[] results = multiplyAll(multiplier,numbers);
    
    assertArrayEquals (results, new int[]{2 , 0 , 0 , -1});
}
    
}

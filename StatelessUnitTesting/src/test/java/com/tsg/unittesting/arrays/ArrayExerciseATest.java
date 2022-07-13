/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class ArrayExerciseATest {

    /* Given an array of ints, find and return the maximum value.
     * 
     * Example Results:
     * maxOfArray( {1}  ) ->  1
     * maxOfArray( {3,4,5}  ) ->  5
     * maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
     * 
     * @param numbers array of integers
     * @return int max
     */
    public ArrayExerciseATest() {
    }

    @Test
    public void maxArray1() {
        int[] numbers = {1};
        int result = 1;

        assertEquals(result, 1);
    }

    @Test
    public void maxArray345() {
        int[] numbers = {3, 4, 5};
        int result = 5;

        assertEquals(result, 5);

    }

    @Test
    public void maxArrayNegatives() {

        int[] numbers = {-9000, -700, -50, -3};
        int result = -3;

        assertEquals(result, -3);
    }
}

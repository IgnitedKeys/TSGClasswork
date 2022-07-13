/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseD.pointFree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gavinlinnihan
 */
public class ArrayExerciseDTest {
    /*
     * Given an array of doubles, return the biggest number of the lot, as if the decimal had gone missing!
     *
     * 
     * pointFree( [1.1, .22]  ) ->  22
     * pointFree( [ .039 , 20 , .005005 ]  ) ->  5005
     * pointFree( [ -9.9 , -700 , -.5  ]  ) ->  -5
     * 
     * @param numbers
     * @return
     */
    
    public ArrayExerciseDTest() {
    }

    @Test
    public void pointFree1(){
        double[] numbers = new double[] {1.1, .22};
        int result = pointFree(numbers);
        
        assertEquals(result, 22);
        
    }
    
    @Test
    public void pointFree2() {
        double[] numbers = new double[] {.039, 10, .005005};
        int result = pointFree(numbers);
        
        assertEquals(result, 5005);
    }
    
    @Test 
    public void pointFree3() {
        double[] numbers = new double[] {-9.9,-700, -.5};
        int result = pointFree(numbers);
        
        assertEquals(result, -5);
    }
    
}

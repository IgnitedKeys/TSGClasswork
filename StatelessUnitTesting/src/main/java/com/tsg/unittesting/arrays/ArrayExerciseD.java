/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.arrays;

/**
 *
 * @author ahill
 */
public class ArrayExerciseD {
    
    /**
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
    public static int pointFree(double[] numbers){
        int highest=-10000000;
        for(int i = 0; i < numbers.length; i++) {
            String num = Double.toString(numbers[i]).replace(".", "");
            int noDec = Integer.parseInt(num);
            if(noDec > highest) {
                highest = noDec;
            }
        }
        
        return highest;
        
    }
    
}

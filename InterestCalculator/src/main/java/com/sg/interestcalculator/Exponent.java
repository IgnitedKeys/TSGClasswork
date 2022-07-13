/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

/**
 *
 * @author gavinlinnihan
 */
public class Exponent {

    public float findExponents(float x, int y) {
        float result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }
}


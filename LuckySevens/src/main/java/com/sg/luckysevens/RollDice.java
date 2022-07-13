/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

import java.util.Random;

/**
 *
 * @author angeladrees
 */
public class RollDice {

    public int roll() {
        Random diceRoll = new Random();
        int roll = diceRoll.nextInt(6) + 1;
        return roll;

    }
}

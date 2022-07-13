/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseE.whatColor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class LogicExerciseETest {
    /*
     * Given the following chart, return the correct color designation 
     * given measured wavelength, frequency and photonic energy. 
     * If it doesn't fall within correct bands, return "Unknown" instead. 
     * If it falls exactly within a band transition, 
     * return a compound color, with the longer wavelength color first. 
     * 
     * 	Color	Wavelength	Frequency	Photon energy
     * 	Violet	380–450 nm	668–789 THz	2.75–3.26 eV
     * 	Blue	450–495 nm	606–668 THz	2.50–2.75 eV
     * 	Green	495–570 nm	526–606 THz	2.17–2.50 eV
     * 	Yellow	570–590 nm	508–526 THz	2.10–2.17 eV
     * 	Orange	590–620 nm	484–508 THz	2.00–2.10 eV
     * 	Red	620–750 nm	400–484 THz	1.65–2.00 eV
     *
     * Ex:
     * whatColor( 575, 510, 2.15 ) ->  "Yellow"
     * whatColor( 449, 670, 3.00 ) ->  "Violet"
     * whatColor( 621, 475, 16.5 ) ->  "Unknown"
     * whatColor( 590, 508, 2.05 ) ->  "Orange"
     * whatColor( 570, 526, 2.17 ) ->  "Yellow-Green"
     * @param waveLengthNM
     * @param frequencyTHZ
     * @param photonicEnergyEV
     * @return String color
     */
    
    public LogicExerciseETest() {
    }

    @Test
    public void whatColorYellow() {
        int waveLengthNM = 575;
        int frequencyTHZ = 510;
        double photonicEnergyEV = 2.15;
        
        String color = whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(color, "Yellow");
    }
    
    @Test
    public void whatColorViolet(){
        int waveLengthNM = 449;
        int frequencyTHZ = 670;
        double photonicEnergyEV = 3.00;
        
        String color = whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(color, "Violet");
        
    }
    
    @Test
    public void whatColorUnKnown(){
        int waveLengthNM = 621;
        int frequencyTHZ = 475;
        double photonicEnergyEV = 16.5;
        
        String color = whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(color, "Unknown");
        
    }
    
    @Test
    public void whatColorOrange() {
        
        int waveLengthNM = 590;
        int frequencyTHZ = 508;
        double photonicEnergyEV = 2.05;
        
        String color = whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(color, "Orange");
    }
    
    @Test
    public void whatColorYellowGreen() {
        int waveLengthNM = 570;
        int frequencyTHZ = 526;
        double photonicEnergyEV = 2.17;
        
        String color = whatColor(waveLengthNM, frequencyTHZ, photonicEnergyEV);
        assertEquals(color, "Yellow-Green");
        
    }
    
}

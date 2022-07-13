/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseB.tripleIt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class StringsExerciseBTest {
    /*
     * Triples your String input and returns it.
     * However, make the first instance lowercase, the second uppercase, 
     * and third and final lowercase - just to mix things up!
     *
     * Ex:
     * tripleIt( "Llama" ) ->  "llamaLLAMAllama"
     * tripleIt( "ha" ) ->  "haHAha"
     * tripleIt( "Beetlejuice" ) ->  "beetlejuiceBEETLEJUICEbeetlejuice"
     * @param theString
     * @return String triple trouble
     */
    
    public StringsExerciseBTest() {
    }

    @Test
    public void tripleItLlama() {
        String string ="Llama";
        String triple = tripleIt(string);
        assertEquals("llamaLLAMAllama", triple);
    }
    @Test
    public void tripleItHa(){
        String string ="ha";
        String triple = tripleIt(string);
        assertEquals("haHAha", triple);
        
    }
    @Test
    public void tripleItBeetle(){
        String string = "Beetlejuice";
        String triple = tripleIt(string);
        assertEquals("beetlejuiceBEETLEJUICEbeetlejuice", triple);
    }
    
    
}

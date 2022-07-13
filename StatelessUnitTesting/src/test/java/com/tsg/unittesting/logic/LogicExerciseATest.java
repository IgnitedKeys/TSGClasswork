/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class LogicExerciseATest {
    /*
     * This is a shy method. 
     * 
     * It only likes to greet friends by name with a hearty hello, 
     * but strangers just get a simple quiet 'hi'. Given the name of who's visiting, 
     * and a boolean of whether or not they're a friend, return the proper greeting.
     * Keep in mind, you greet named visitors, but not the nameless!
     * 
     * friendlyGreeting( "Goofus" , false ) ->   "hi"
     * friendlyGreeting( "Gallant" , true ) ->   "Hello, Gallant!"
     * friendlyGreeting( null , false ) ->   "..."
     * 
     * @param visitorName
     * @param isFriend
     * @return String greeting
     */
    
    public LogicExerciseATest() {
    }

    @Test
    public void friendlyGreetingGoofus() {
        String name = "Goofus";
        Boolean isFriend = false;
        String result = friendlyGreeting(name, isFriend);
        
        assertEquals(result, "hi");
    }
    
    @Test
    public void friendlyGreetingGallant() {
        String name = "Gallant";
        Boolean isFriend = true;
        String result = friendlyGreeting(name, isFriend);
        
        assertEquals(result, "Hello, Gallant!");
    }
    
    @Test
    public void friendlyGreetingNull() {
        String name = null;
        Boolean isFriend = false;
        String result = friendlyGreeting(name, isFriend);
        
        assertEquals(result, "...");
    }
    
}

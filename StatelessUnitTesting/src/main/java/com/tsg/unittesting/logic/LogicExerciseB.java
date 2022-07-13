/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.logic;

/**
 *
 * @author ahill
 */
public class LogicExerciseB {

    /**
     * Given a number, return the 'place rank' word associated with it. I.e.
     * pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! Also, start
     * by going up to 100, but stretch to more if you can!
     *
     * Ex: placeOf( 1 ) -> "1st" placeOf( 3 ) -> "3rd" placeOf( 22 ) -> "22nd"
     *
     * @param place
     * @return String
     */
    public static String placeOf(int place) {
        String placement = Integer.toString(place);
        char lastNumber = placement.charAt(placement.length() -1);

        if (lastNumber == '1' && placement != "11") {
            placement += "st";
        }
        else if (lastNumber == '2' && placement != "12") {
            placement += "nd";
        }
        else if (lastNumber == '3' && placement != "13") {
            placement += "rd";
        } else {
            placement += "th";
        }

        return placement;
    }

}

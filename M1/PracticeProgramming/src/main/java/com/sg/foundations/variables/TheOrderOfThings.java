/*
 *@author angeladrees
 */
package com.sg.foundations.variables;

public class TheOrderOfThings {

    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        shape = "oblong";
        age = "new";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        System.out.println(opinion + " " + age + " " + size + " " + color + " " + shape + " " + purpose + " " + number + " " + material + " " + origin + " " + noun);
    }
}

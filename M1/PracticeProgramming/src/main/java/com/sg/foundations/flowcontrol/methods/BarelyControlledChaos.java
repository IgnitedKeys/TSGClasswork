/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.methods;
import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args){
        String color = pickColor();
        String animal = pickAnimal();
        String colorAgain = pickColor();
        int weight = pickNumber(5,200);
        int distance = pickNumber(10,20);
        int number = pickNumber(10000,20000);
        int time = pickNumber(2,6);
        
        System.out.println("Once when i was very small...");
        System.out.println("I was chased by a " + color + ", " + weight + "lb miniature " + animal + " for over " + distance + " miles!!");
        System.out.println("I had to hid in a field of over "+ number + " " + colorAgain + " poppies for nearly " + time + " hours until it leaf me alone!");
        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
    }
    public static String pickColor(){
        Random number= new Random();
        int index = number.nextInt(4);
        String color = "";
        switch(index){
            case 0 :
                color = "Playdough pink";
            case 1:
                color = "Radient yellow";
            case 2:
                color= "Tasteful baby blue";
            case 3:
                color ="Fried Orange";
            case 4:
                color ="Embrassed Red";
          
        }
        return color;
        
        
        
        
    }
    public static String pickAnimal(){
        Random number = new Random();
        String animal = "";
        int index = number.nextInt(4);
        switch (index) {
            case 0:
                animal= "Dolphin";
            case 1: 
                animal ="Zebra";
            case 2:
                animal ="Moose";
            case 3:
                animal = "Peacock";
            case 4:
                animal = "Dog";
        }
        return animal;
        
    }
    public static int pickNumber(int x, int y){
        Random number = new Random();
        int randNumber = number.nextInt(y-x) + x;
        return randNumber;
        
    }
}

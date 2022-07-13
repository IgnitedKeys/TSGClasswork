/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.arrays;

public class FruitSalad {
    public static void main(String[] args){
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        String[] fruitSalad = new String[12];
        
        int totalNumberOfFruits = 0;
        int numberOfApples = 0;
        int numberOfOranges = 0;
        int index = 0;
        
        for(int i = 0; i < fruit.length;i++){
            if(totalNumberOfFruits > 12){
                break;
            }
            //if contains 'berry'
            if(fruit[i].contains("berry")){
             
                totalNumberOfFruits++;
                //System.out.println(fruit[i]);
                fruitSalad[index] = fruit[i];
                index++;
                
            }
            //only 3 types of apples
            else  if(fruit[i].contains("Apple") && numberOfApples < 3){
                totalNumberOfFruits++;
                numberOfApples++;
                //System.out.println(fruit[i]);
                fruitSalad[index] = fruit[i];
                index++;
                
            }
            //only 2 types of oranges
            else if(fruit[i].contains("Orange") && numberOfOranges < 2){
                totalNumberOfFruits++;
                numberOfOranges++;
                //System.out.println(fruit[i]);
                fruitSalad[index] = fruit[i];
                index++;
            }
            //no tomatoes
            //no more than 12 kinds of fruit
        }
        
        System.out.println(totalNumberOfFruits);
        for(int i = 0; i < fruitSalad.length;i++){
            System.out.print(fruitSalad[i] + " ");
        }
    }
    
}

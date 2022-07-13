/*
 @author angeladrees
 */
package com.sg.foundations.flowcontrol.whiles;


public class LovesMe {
    public static void main(String[] args){
      

   
    int pedals = 34;
    
    
    while(pedals > 0){
        if(pedals % 2 == 0){
            System.out.println("It LOVES me!");
        } else {
            System.out.println("It loves me NOT!");
        }
        pedals--;
    }


    }

}

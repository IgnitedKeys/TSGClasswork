/*
@author angeladrees
 */
package com.sg.foundations.flowcontrol.fors;

public class ForByFor {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("l");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if((i == 0 || i == 2) && j == 1){
                        System.out.print("$");
                    } else if (i == 1 && j == 1) {
                        System.out.print("#");
                    } else if (i==1 &&(j==0 || j == 2)){
                        System.out.print("@");
                    }
                    else {
                        System.out.print("*");
                    } 
                }
                System.out.print("l");
            }
            System.out.println("");
        }
    }
}

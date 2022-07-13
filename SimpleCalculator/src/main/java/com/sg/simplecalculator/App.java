/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.simplecalculator;

/**
 *
 * @author angeladrees
 */
import java.util.Scanner;
import com.sg.userioclasslab.*;
public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean doCalculation = true;

        double result  = 0;
        UserIO userIo = new UserIOImpl();


        SimpleCalculator myCalc = new SimpleCalculator();

        while (doCalculation == true) {
            String operation = userIo.readString("Which operation? +, -, *, or /");
            double num1 = userIo.readDouble("Insert first number");
            double num2 = userIo.readDouble("Insert second number");
    
            
            if(operation.equals("+")){
                result = myCalc.Adder(num1, num2);
            }
            if(operation.equals("-")){
                result = myCalc.Subtracter(num1,num2);
            }
            if(operation.equals("*")){
                result = myCalc.Multiplier(num1, num2);
            }
            if(operation.equals("/")){
                result = myCalc.Divider(num1, num2);
            }
           
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

            String moreCalcs = userIo.readString("Do another calculation? y/n");
            if (moreCalcs.equals("n")) {
                doCalculation = false;
            }

        }
        System.out.println("Thank you for using Simple Calculator");
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.mathoperators;

/**
 *
 * @author angeladrees
 */
public class App {

    public static void main(String[] args) {
        IntMath calculator = new IntMath();
        UserIO io = new UserIOImpl();
        int firstNum = io.readInt("Enter first number");
        int secondNum = io.readInt("Enter second number");

        String addition = String.valueOf(calculator.calculate(MathOperator.PLUS, firstNum, secondNum));
        io.print(firstNum + "+" + secondNum + " = " + addition);

        String subtraction = String.valueOf(calculator.calculate(MathOperator.MINUS, firstNum, secondNum));
        io.print(firstNum + "-" + secondNum + " = " + subtraction);

        String multiplication = String.valueOf(calculator.calculate(MathOperator.MULTIPLY, firstNum, secondNum));
        io.print(firstNum + "*" + secondNum + " = " + multiplication);

        String division = String.valueOf(calculator.calculate(MathOperator.DIVIDE, firstNum, secondNum));
        io.print(firstNum + "/" + secondNum + " = " + division);
    }
}

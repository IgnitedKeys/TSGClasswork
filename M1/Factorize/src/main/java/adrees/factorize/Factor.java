/*
 @angeladrees
date:2021-09-21
email:drees.angie@gmail.com
 */
package adrees.factorize;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args){
        Scanner userNumber = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        
        
        System.out.println("What number would you like to factor? ");
        int number = Integer.parseInt(userNumber.nextLine());
        System.out.println(number);
        if(number < 1){
            System.out.println("Not a positive number");
            System.exit(0);
        }
        
        //factor numbers not including the starting number
        //this is so we can add them for checking perfect number later
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                counter++;
                System.out.print(i + " ");
                sum += i;
            }
            
        }
        //add number to end of factors
        System.out.print(number + "\n");
        //add 6 to the counter
        counter++;
        
        System.out.println(number + " has " + counter + " factors");
        if(sum == number){
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        if(counter == 2){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        
        
        
  
        
        
    }
    
}
